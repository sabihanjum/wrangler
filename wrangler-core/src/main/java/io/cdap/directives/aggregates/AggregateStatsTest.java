@Test
public void testAggregateStatsDirective() throws Exception {
    List<Row> rows = Arrays.asList(
        new Row("data_size", "10KB", "time_duration", "500ms"),
        new Row("data_size", "20KB", "time_duration", "1500ms")
    );

    String[] recipe = {
        "aggregate-stats :data_size :time_duration total_size_mb total_time_sec"
    };

    List<Row> results = TestingRig.execute(recipe, rows);

    Assert.assertEquals(1, results.size());
    Row result = results.get(0);
    Assert.assertEquals(0.029, (double) result.getValue("total_size_mb"), 0.001);
    Assert.assertEquals(2.0, (double) result.getValue("total_time_sec"), 0.001);
}

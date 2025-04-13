@Test
public void testTimeDurationParsing() {
    TimeDuration time = new TimeDuration("150ms");
    Assert.assertEquals(150_000_000, time.getNanoseconds());

    time = new TimeDuration("2.5s");
    Assert.assertEquals(2_500_000_000L, time.getNanoseconds());
}

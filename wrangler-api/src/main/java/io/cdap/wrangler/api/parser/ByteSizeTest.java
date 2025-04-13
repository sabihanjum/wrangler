@Test
public void testByteSizeParsing() {
    ByteSize size = new ByteSize("10KB");
    Assert.assertEquals(10240, size.getBytes());

    size = new ByteSize("1.5MB");
    Assert.assertEquals(1572864, size.getBytes()); // 1.5 * 1024 * 1024
}

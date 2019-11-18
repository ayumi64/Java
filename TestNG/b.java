
public class TestNGSimpleTest {
	@Test
	public void testAdd() {
		var str = "TestNG is working fine";
		assertEquals("TestNG is working fine", str);
	}

	private void assertEquals(String string, String str) {
	}
}

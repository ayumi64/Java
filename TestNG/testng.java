
import TestNG.TestNGSimpleTest;

public class TestNGLearn {
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("this is beforeSuite");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("this is afterSuite");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("this is before class");
	}
	@AfterClass
	public void afterClass(){
		System.out.println("this is after class");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println("this is a beforeTest");
	}
	@AfterTest
	public void afterTest(){
		System.out.println("this is a afterTest");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("this is a beforeMethod");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("this is a afterMethod");
	}
	@Test
	public void testNgLearn(){
		System.out.println("this is a testcase1");
	}
	@Test
	public void testNgLearn1(){
		System.out.println("this is a testcase2");
	}
 
}
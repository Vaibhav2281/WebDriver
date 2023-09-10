package practiiccee;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="abc")
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test(groups= {"abc", "xyz"})
	public void test2() {
		System.out.println("This is test2");
	}
	
	@Test(groups="xyz")
	public void test3() {
		System.out.println("This is test3");
	}

}

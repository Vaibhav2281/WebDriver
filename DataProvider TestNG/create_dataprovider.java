package practiiccee;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class create_dataprovider {
	
	@Test(dataProvider= "details")
	public void test(String uname, String mail) {
		System.out.println("Name: " + uname);
		System.out.println("Email id: "+ mail);
	}
	
	@DataProvider
	public Object[][] details(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Vaibhav";
		data[0][1] = "vb@gmail.com";
		
		data[1][0] = "Vishal";
		data[1][1] = "Vish@gmail.com";
		
		return data;
	}

}

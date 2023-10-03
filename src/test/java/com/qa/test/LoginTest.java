package com.qa.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.TestUtil;
public class LoginTest {
	
	@DataProvider
	/*public Object[][] getData(){
		//Call the Util class getDataFromExcel method and return the data in a 2D object array.
		Object[][] data=TestUtil.getDataFromExcel("sheetName");
		return data;
	}*/
	
	@Test(dataProvider="getData")
	public void login(String uname, String pwd) {
		
	}

}

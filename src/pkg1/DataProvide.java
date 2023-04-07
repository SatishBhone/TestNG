package pkg1;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {
// Code of Data Provider
	
	@DataProvider(name="dataSet")
	public String[][] dataToTest()
	{
		String [][] data= {{"Ganesh","7888225184","445204","NagpurCity"},{"Atul", "9545658087","413512", "Pusad"}};
		return data;
	}
	
	@Test(priority=1, dataProvider="dataset")
	public void varifyUserCanAddNewAddress(String name, String mobNumber, String pincode, String locality) 
	{
		List<String> dataList = new ArrayList<>();
		
		dataList.add(name);
		dataList.add(mobNumber);
		dataList.add(pincode);
		dataList.add(locality);
      
	}
}

package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviders 
{
	@DataProvider(name="Invalidusercredentials")
	public Object userCredentialsdata()
	{
		Object data[][]= new Object[3][2];
		data[0][0]="rahulnik@gmail.com";		
		data[0][1]="rahul111";		
		data[1][0]="rahulnik11@gmail.com";		
		data[1][1]="nikh1111";		
		data[2][0]="abhgd@gmail.com";		
		data[2][1]="sh122";
		
		
		return data;
	}

}

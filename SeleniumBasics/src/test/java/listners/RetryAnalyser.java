package listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer 
{
	int count=0, retrylimit=2;

	public boolean retry(ITestResult result)
	{
		if (count<retrylimit)
		{
			count++;
			return true;
		}
		
		return false;
	}
	
	
	

}

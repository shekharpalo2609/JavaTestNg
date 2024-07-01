package iRetry;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Retry_Logic implements IRetryAnalyzer
{

	int initial_count=0;
	int retry_times=3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		
		if(initial_count<retry_times)//0<3,1<3
		{
			System.out.println(initial_count);
			initial_count++;//1,2
			return true;
		}
		return false;
	}

}

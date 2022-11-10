package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.qa.utilities.DriverFactory;
import com.qa.utilities.ReadConfigg;
import com.qa.utilities.UtilClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{

	private DriverFactory driverfactory;
	private WebDriver driver;
	private ReadConfigg readconfigg;
	private UtilClass util;
	@Before(order=0)
	public void startWindow()
	{
		readconfigg=new ReadConfigg();
		driverfactory=new DriverFactory();
		util=new UtilClass(driver); 
		driver=driverfactory.browserInit(readconfigg.getBrowserName());
		driver.get(readconfigg.getUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
	
	}
	@After(order=1)
	public void EndWindow()
	{
		//driver.quit();
	}
}
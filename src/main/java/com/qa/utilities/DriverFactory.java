package com.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory
{
public static ThreadLocal<WebDriver> TL=new ThreadLocal<WebDriver>();
private WebDriver driver;
public WebDriver browserInit(String br)
{
	if(br.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(br.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
	else if(br.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("provide valid Browser");
	}
	return getDriver();
	}
public static synchronized WebDriver getDriver() 
{
	return TL.get();
	
}
}

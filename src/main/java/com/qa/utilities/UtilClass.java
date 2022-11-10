package com.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UtilClass 
{
	private WebDriver driver;	
	public UtilClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public String getCurrentURL()
	{
		String url=driver.getCurrentUrl();
		return url;
	}
}


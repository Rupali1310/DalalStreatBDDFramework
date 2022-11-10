package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfigg 
{
private Properties pro;

public ReadConfigg()
{
File src=new File("D:\\AUTOMATION TESTING\\DAILY NOTES SELENIUM\\File HandelingExcelSheet\\DalalStreatBDDFramework\\src\\main\\java\\propertyFiles\\configg.properties");	
try
{

	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);

}
catch (IOException e)
{
	System.out.println("File path is not correct");
	e.printStackTrace();
}
}

public  String getBrowserName() 
{
String browserName=pro.getProperty("browser");	
return browserName;
}
public  String getUrl()
{
String url=pro.getProperty("url");
return url;
}



}


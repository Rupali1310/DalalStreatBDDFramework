package com.qa.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
private WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
PageFactory.initElements(driver, this);	
}
//-------repositories
private By username_box=By.xpath("//input[@name='email']");
private By psw_box=By.xpath("//input[@name='password']");
private By login_button=By.xpath("//button[@class='btn btn-dark btn-block']");

//-----methods

public void  enterEmail(String email)
{
	driver.findElement(username_box).sendKeys(email);
}

public void enterPassWord(String psw)
{
	
driver.findElement(psw_box).sendKeys(psw);
}
public void clickonLoginbutton()
{
	
driver.findElement(psw_box).click();
}








}

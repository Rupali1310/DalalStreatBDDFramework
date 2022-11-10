package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.qa.pageLayer.LoginPage;
import com.qa.utilities.DriverFactory;
import com.qa.utilities.UtilClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps
{
	private LoginPage login =new LoginPage(DriverFactory.getDriver());
	private  UtilClass util= new UtilClass(DriverFactory.getDriver());
	
    @Given("user is on loginPage")
    public void user_is_on_loginPage() throws Throwable {
    	String Actual_url=util.getCurrentURL();
    	String Expected="https://www.apps.dalalstreet.ai/login";
    	Assert.assertEquals(Actual_url, Expected);
    }
    @When("user enters Username as {string}")
    public void user_enters_username_as_something(String email) throws Throwable {
    	login.enterEmail(email);
    }

    @And("user enters Password as {string}")
    public void user_enters_password_as_something(String psw) throws Throwable {
    	login.enterPassWord(psw);
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() throws Throwable {
    	login.clickonLoginbutton();
        
    }

//    @Then("user logged into application and shows name as {String} on homepage")
//    public void user_logged_into_application_and_shows_name_as_something_on_homepage(String strArg1) throws Throwable {
//    	
//    	
//    }

    


}

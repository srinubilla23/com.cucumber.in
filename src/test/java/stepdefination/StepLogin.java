package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.chrome.ChromeOptions;*/

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepLogin 
{
	WebDriver driver;
	
	@Given("^open chrome$")
	public void open_chrome() throws Exception 
	{ 
	   /*ChromeOptions opt=new ChromeOptions();
	   opt.addArguments("start-maximized");*/
	   System.setProperty("webdriver.chrome.driver", "D:\\Jar Files\\Drivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	  /* opt.addArguments("--disable notifications");*/
	}

	@Then("^Enter URl$")
	public void enter_URl() throws Exception 
	{
	   driver.get("http://www.facebook.com");
	    
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" correct$")
	public void and_correct(String username, String password) throws Exception 
	{
	    driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("pass")).sendKeys(password);
	   
	}

	@Then("^opens fb Homepage$")
	public void opens_fb_Homepage() throws Exception 
	{
	   String title=driver.getTitle();
	   if(title.equalsIgnoreCase("facebook"))
	   {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
	   
	}

	@Then("^close window$")
	public void close_window() throws Exception 
	{
	    
	   driver.close();
	}
}

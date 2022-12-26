package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class OrangeHrmSteps {
	WebDriver driver;
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayas\\eclipse-workspace\\SeleniumCucumber\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();//launch diver
	    
	}

	@When("open OrangeHrm homepage")
	public void open_orange_hrm_homepage() {
	    driver.get("https://www.orangehrm.com/");//open the url
	}

	@SuppressWarnings("deprecation")
	@Then("I verify that the logo is present on the page")
	public void i_verify_that_the_logo_is_present_on_the_page() {
	    boolean imagedisp=driver.findElement(By.xpath("//a[@class='navbar-brand nav-logo']")).isDisplayed();
	   Assert.assertEquals(true, imagedisp);
	    
	}

	@And("close the browser")
	public void close_the_browser() {
	    driver.quit();
	}
}

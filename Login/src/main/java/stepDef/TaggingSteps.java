package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class TaggingSteps {
	public WebDriver driver;
	@Given("verify url test")
	public void verify_url_test() {
		System.setProperty("webdriver.chrome.driver","D://eclipse/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize(); 
	}

	@Given("this close browser")
	public void this_close_browser() {
	    driver.quit();
	}

	@Given("this verify login")
	public void this_verify_login() {
	    
	}



}

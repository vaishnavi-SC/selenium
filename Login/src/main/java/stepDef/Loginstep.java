package stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Loginstep {
	public WebDriver driver;
	@Given("Enter the Url")
	public void enter_the_Url() {
		System.setProperty("webdriver.chrome.driver","D://eclipse/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize(); 
	}

	/*@When("Enter the username and password")
	public void enter_the_username_and_password(DataTable dt) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		//AsList
		//List<String> user=dt.asList(String.class);
		
		driver.findElement(By.name("userName")).sendKeys(user.get(0));
		driver.findElement(By.name("password")).sendKeys(user.get(0));
		
		
		//As List of As List
		List<List<String>> user=dt.asLists(String.class);
		driver.findElement(By.name("userName")).sendKeys(user.get(1).get(0));
		driver.findElement(By.name("password")).sendKeys(user.get(1).get(1));
		
		//As List of Map
		List<Map<String, String>> user=dt.asMaps(String.class,String.class);
		driver.findElement(By.name("userName")).sendKeys(user.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(user.get(0).get("password"));
	}*/
	@When("Enter the username{string} and password {string}")
	public void enter_the_username_and_password(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}
	@Then("user click login button")
	public void user_click_login_button() {
		driver.findElement(By.name("login")).click();
	   
	}


}

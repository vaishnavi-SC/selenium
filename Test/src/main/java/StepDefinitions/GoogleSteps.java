package StepDefinitions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class GoogleSteps {
	WebDriver driver;
	@Given("I launch Chrome browser")
	public void i_launch_Chrome_browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","D://eclipse/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}

	@When("I open Google Homepage")
	public void i_open_Google_Homepage() throws Exception {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		 
	}

	/*@Then("I verify that the page displays search text box")
	public void i_verify_that_the_page_displays_search_text_box(DataTable dt) throws Exception {
		List<String> s=dt.asList(String.class);
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(s.get(0));
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) // for(WebElement items:list)
		{
			String items=list.get(i).getText();
			//System.out.println(items);
			if(items.contains("java tutorial"))
			{
				list.get(i).click();
				break;
			}
		}
	}
*/
	@Then("I verify that the page displays {string} search text box")
	public void i_verify_that_the_page_displays_search_text_box(String string) {
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(string);
		List <WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) // for(WebElement items:list)
		{
			String items=list.get(i).getText();
			//System.out.println(items);
			if(items.contains("java tutorial"))
			{
				list.get(i).click();
				break;
			}
		}
	}





}

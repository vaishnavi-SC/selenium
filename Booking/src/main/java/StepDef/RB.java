package StepDef;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class RB {
	public WebDriver driver;
	@Given("the user lanches RedBus Url")
	public void the_user_lanches_RedBus_Url() {
		System.setProperty("webdriver.chrome.driver","D://eclipse/chromedriver.exe");
		//driver=new ChromeDriver();

        // Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();
      
        // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();
		// Set the experimental option
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	   
	}

	/*@When("user Select Chennai from Soruce Dropdown")
	public void user_Select_Chennai_from_Soruce_Dropdown() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		//List<String> source=dt.asList(String.class);
		driver.findElement(By.id("src")).sendKeys("chennai");
		//driver.findElement(By.id("src")).sendKeys(source.get(0));
		Thread.sleep(3000);
		List <WebElement> s=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//li"));
		
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).getText().equalsIgnoreCase("Koyambedu, Chennai"))
			{
				s.get(i).click();
				break;
			}
		}
	}

	@And("user Select Hyd from Distination Dropdown")
	public void user_Select_Hyd_from_Distination_Dropdown() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("dest")).sendKeys("bangalore");
		Thread.sleep(3000);
		List <WebElement> d=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//li"));
		for(int j=0;j<d.size();j++)
		{
			if(d.get(j).getText().equalsIgnoreCase("Bangalore (All Locations)"))
			{
				d.get(j).click();
				break;
			}
		}
	}
*/
	/*@When("user Select {string} from Soruce Dropdown")
	public void user_Select_from_Soruce_Dropdown(String string) throws InterruptedException {
		driver.findElement(By.id("src")).sendKeys(string);
		//driver.findElement(By.id("src")).sendKeys(source.get(0));
		Thread.sleep(3000);
		List <WebElement> s=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//li"));
		
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).getText().equalsIgnoreCase("Koyambedu, Chennai"))
			{
				s.get(i).click();
				break;
			}
		}
	}

	@When("user Select {string} from Distination Dropdown")
	public void user_Select_from_Distination_Dropdown(String string) throws InterruptedException {
		driver.findElement(By.id("dest")).sendKeys(string);
		Thread.sleep(3000);
		List <WebElement> d=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//li"));
		for(int j=0;j<d.size();j++)
		{
			if(d.get(j).getText().equalsIgnoreCase("Bangalore (All Locations)"))
			{
				d.get(j).click();
				break;
			}
		}
	}*/
	
	@When("user Select from Soruce Dropdown")
	public void user_Select_from_Soruce_Dropdown(DataTable dt) throws InterruptedException {
		List<String> sor=dt.asList(String.class);
		driver.findElement(By.id("src")).sendKeys(sor.get(0));
		Thread.sleep(3000);
		List <WebElement> s=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//li"));
		
		for(int i=0;i<s.size();i++)
		{
			if(s.get(i).getText().equalsIgnoreCase("Koyambedu, Chennai"))
			{
				s.get(i).click();
				break;
			}
		}
	}

	@When("user Select from Distination Dropdown")
	public void user_Select_from_Distination_Dropdown(DataTable dt) throws InterruptedException {
		List<String> des=dt.asList(String.class);
		driver.findElement(By.id("dest")).sendKeys(des.get(0));
		Thread.sleep(3000);
		List <WebElement> d=driver.findElements(By.xpath("//ul[@class=\"autoFill\"]//li"));
		for(int j=0;j<d.size();j++)
		{
			if(d.get(j).getText().equalsIgnoreCase("Bangalore (All Locations)"))
			{
				d.get(j).click();
				break;
			}
		}
	}


	@And("user select {double}{double} in onward date")
	public void user_select_in_onward_date(Double double1, Double double2) throws InterruptedException {
		Thread.sleep(2000);
		
		for(int i=0;i<12;i++)
			{
				String month=driver.findElement(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]//table//tr[1]/td[2]")).getText();
				System.out.println(month);
				Thread.sleep(3000);
				String m[]=month.split(" ");
				System.out.println(m[0]);
				int n=m.length;
				if(m[0].equalsIgnoreCase("Apr"))
				{
					Thread.sleep(3000);
					List <WebElement> mon=driver.findElements(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]//table//td"));
					Thread.sleep(3000);
					for(int k=0;k<mon.size();k++)
					{
						if(mon.get(k).getText().contains("16"))
						{
							mon.get(k).click();
							break;
						}
						
					}
					break;
				}
				else
				{
					Thread.sleep(3000);
					driver.findElement(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]//td[3]//button")).click();
					
				}
				}
	   
	}

	@And("user click search button")
	public void user_click_search_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id=\"search_btn\"]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}

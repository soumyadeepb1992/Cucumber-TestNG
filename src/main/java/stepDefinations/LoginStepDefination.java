package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {
	
	
		WebDriver driver;
		
		@Given("^user is already on Login Page$")
		public void user_already_on_Loginpage() {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			//options.addArguments("--disable-extensions");
			//options.addArguments("--disable-infobars");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			System.out.println("Url opens");
			
		}
		
		@When("^title of login page is OrangeHRM$")
		public void title_of_login_page_is_OrangeHRM() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("OrangeHRM", title);
			
		}
		
		//Reg Exp:
		//1. \"([^\"]*)\"
		//2. \"(.*)\"
		
		@Then("^user enters \"(.*)\" and \"(.*)\"$")
		public void user_enters_username_and_password(String username, String password) {
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);;
			
		}
		
		@Then("^user clicks in login button$")
		public void user_clicks_on_login_button() {
			WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
			loginBtn.click();
			
		}
		
		@Then("^user is on home page$")
		public void user_is_on_home_page() {
			String title = driver.getTitle();
			System.out.println("Home Page title ::"+ title);
			Assert.assertEquals("OrangeHRM", title);
		}
		
		@Then("^close the browser$")
		public void close_the_browser() {
			driver.close();
		}

	

}

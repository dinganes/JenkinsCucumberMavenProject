package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	WebDriver driver;

	@Given("^user launches the url(\\d+)$")
	public void user_launches_the_url(int arg1) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^user enters uname and password$")
	public void user_enters_uname_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("dinadas");

		driver.findElement(By.id("pass")).sendKeys("12345");
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button() throws Throwable {

		driver.findElement(By.id("loginbutton")).click();

	}

}

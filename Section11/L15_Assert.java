package Section11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L15_Assert {

	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http:/teststore.automationtesting.co.uk/login?back=my-account/");
	}

	@Test
	public void enterEmail() {
		Assert.fail();
		driver.findElement(By.cssSelector("section input[name='email'")).sendKeys("pewdiepie122@gmail.com");
	}

	@Test
	public void enterPassword() {
		driver.findElement(By.cssSelector("section input[name='password'")).sendKeys("emoky94");
	}

	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
}

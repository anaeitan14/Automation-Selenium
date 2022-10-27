package Section11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L11_Parameters {

	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@Parameters({ "email", "password" })
	@Test
	public void signin(String email, String password) {
		driver.get("https://teststore.automationtesting.co.uk");
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("section input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("User has logged in");
	}

	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
}

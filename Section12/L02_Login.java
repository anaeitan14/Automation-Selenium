package Section12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L02_Login {

	WebDriver driver;

	@BeforeSuite
	public void setup() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\Eitan\\eclipse-workspace\\Selenium Test\\src\\Section12\\L02_config.properties");
		prop.load(data);

		driver.get(prop.getProperty("url"));
	}

	@Test
	public void signin() {
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("pewdiepie122@gmail.com");
		driver.findElement(By.cssSelector("section input[name='password']")).sendKeys("emoky94");
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("User has logged in");
	}
}

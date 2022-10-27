package Section12;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L03_Login {

	WebDriver driver;

	@BeforeSuite
	public void setup() throws IOException {

		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\Eitan\\eclipse-workspace\\Selenium Test\\src\\Section12\\L03_config.properties");
		prop.load(data);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

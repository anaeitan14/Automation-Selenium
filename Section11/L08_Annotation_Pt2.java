package Section11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class L08_Annotation_Pt2 {

	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void signin() {
		driver.get("https://teststore.automationtesting.co.uk");
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("pewdiepie122@gmail.com");
		driver.findElement(By.cssSelector("section input[name='password']")).sendKeys("emoky94");
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("User has logged in");
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("CLOTHES")).click();
		System.out.println("User has clicked the clothes link");
	}

	@AfterMethod
	public void signout() {
		driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
		System.out.println("User has logged out");
	}

	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
}

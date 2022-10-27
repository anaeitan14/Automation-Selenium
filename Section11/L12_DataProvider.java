package Section11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class L12_DataProvider {

	WebDriver driver;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		// data set 1
		data[0][0] = "pewdiepie122@gmail.com";
		data[0][1] = "emoky94";

		// data set 2
		data[1][0] = "test2@test.com";
		data[1][1] = "test12345";

		// data set 3
		data[2][0] = "pewdioens@gmail.com";
		data[2][1] = "ececex";

		return data;
	}

	@Test(dataProvider = "getData")
	public void signin(String email, String password) {
		driver.get("https://teststore.automationtesting.co.uk");
		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("section input[name='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("User has logged in");
		driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
		System.out.println("User has logged out");
	}

	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}
}

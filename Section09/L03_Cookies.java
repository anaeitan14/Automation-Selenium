package Section09;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L03_Cookies {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/");

		driver.findElement(By.linkText("TEST STORE")).click();
		driver.findElement(By.cssSelector("#_desktop_user_info")).click();
		driver.findElement(By.cssSelector("section input[name='email'")).sendKeys("pewdiepie121@gmail.com");
		driver.findElement(By.cssSelector("section input[name='password'")).sendKeys("emoky94");
		driver.findElement(By.cssSelector("button#submit-login")).click();
		driver.findElement(By.linkText("CLOTHES")).click();
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt'")).click();
		driver.findElement(By.cssSelector(".add-to-cart.btn.btn-primary")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-secondary"))).click();
		
		Thread.sleep(2000);

		driver.manage().deleteAllCookies();

	}

}

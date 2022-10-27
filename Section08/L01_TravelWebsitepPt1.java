package Section08;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L01_TravelWebsitepPt1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.easyjet.com/en");

		driver.findElement(By.id("ensCloseBanner")).click();

		driver.findElement(By.cssSelector("input[name='origin")).click();
		driver.findElement(By.cssSelector("input[name='origin")).sendKeys("London");

		List<WebElement> origins = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 > li > a > span")));

		for (WebElement origin : origins) {
			if (origin.getText().contains("Luton")) {
				origin.click();
			}
		}

		driver.findElement(By.cssSelector("input[name='destination")).click();
		driver.findElement(By.cssSelector("input[name='destination")).sendKeys("n");

		List<WebElement> destinations = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 > li > a > span")));

		for (WebElement destination : destinations) {
			if (destination.getText().contains("Oslo")) {
				destination.click();
			}
		}

	}

}

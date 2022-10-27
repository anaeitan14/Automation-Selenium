package Scratch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.youtube.com/");
//		try {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div#search-input > input#search")).sendKeys("Pewdiepie");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button#search-icon-legacy")));
		driver.findElement(By.cssSelector("button#search-icon-legacy")).click();
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div#contents > ytd-video-renderer:nth-of-type(1) > div#dismissible > .style-scope.ytd-video-renderer > a#thumbnail  img#img")));
		driver.findElement(By.cssSelector("div#contents > ytd-video-renderer:nth-of-type(1) > div#dismissible > .style-scope.ytd-video-renderer > a#thumbnail  img#img")).click();
		
		

//		} catch (Exception e) {
//			driver.quit();			
//		} 

	}

}

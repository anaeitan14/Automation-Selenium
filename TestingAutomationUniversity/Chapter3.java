package TestingAutomationUniversity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/");

		WebElement firstLink = driver.findElement(By.linkText("Shifting Content"));

		firstLink.click();

		WebElement secondLink = driver.findElement(By.linkText("Example 1: Menu Element"));

		secondLink.click();

		List<WebElement> totalElements = driver.findElements(By.tagName("a"));

		System.out.println(totalElements.size());

	}
}
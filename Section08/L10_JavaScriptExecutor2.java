package Section08;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L10_JavaScriptExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/contactForm.html");

		driver.findElement(By.cssSelector("input[name='first_name'")).sendKeys("Eitan");
		driver.findElement(By.cssSelector("input[name='last_name'")).sendKeys("Lich");
		driver.findElement(By.cssSelector("input[name='email'")).sendKeys("Eitanlich@yahoo.com");
		driver.findElement(By.cssSelector("textarea")).sendKeys("Lorem ipsum");

		WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
		WebElement reset = driver.findElement(By.cssSelector("[type='reset']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click(), arguments[1].click", reset, submit);

	}
}
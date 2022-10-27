package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_SendingData {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/contactForm.html");

		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Eitan");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("Lichtenstein");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("eitanlich@Yahoo.com");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("Hi, testing testing 1 2 3 1 2 3  ... ");
	}

}

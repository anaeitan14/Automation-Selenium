package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L12_Accordion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/accordion.html");

		for (int i = 1; i < 6; i += 2) {
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(" + i + ")")).click();
			driver.findElement(By.cssSelector(".accordion > div:nth-of-type(" + i + ")")).click();

		}

	}
}
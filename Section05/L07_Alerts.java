package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/popups.html");

		driver.findElement(By.cssSelector("[onclick='alertTrigger\\(\\)']")).click();

		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
//		This comment was added by my desktop
//		This comment was added my my laptop

	}

}

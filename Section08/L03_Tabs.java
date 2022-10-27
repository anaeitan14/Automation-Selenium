package Section08;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_Tabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/browserTabs.html");

		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
		}

		ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());

		for (String window : windows) {
			driver.switchTo().window(window);
			Thread.sleep(2000);
		}

		driver.switchTo().window(windows.get(0));

	}
}
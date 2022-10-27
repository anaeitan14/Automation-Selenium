package Section08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_iFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/iframes.html");

		driver.switchTo().frame(0);

		driver.findElement(By.cssSelector(".toggle")).click();

		Thread.sleep(3000);

		driver.switchTo().parentFrame();

		driver.findElement(By.cssSelector(".toggle")).click();

		driver.switchTo().frame(1);
		
		driver.findElement(By.cssSelector("[aria-label='Play']")).click();
		

	}

}

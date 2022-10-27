package Section04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L07_LocatingByXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/buttons.html");

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div[1]/button")).click(); // Absolute path, starts with single /

		driver.findElement(By.xpath("//button[@id='btn_one']")).click(); // Relative path, starts with //

	}
}

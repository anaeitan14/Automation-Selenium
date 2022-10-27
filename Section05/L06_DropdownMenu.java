package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L06_DropdownMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");

		Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));

		menuItem.selectByVisibleText("Honda");

		menuItem.selectByValue("jeep");

		Thread.sleep(5000);
		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		driver.findElement(By.xpath("//*[@id=\"primary_nav_wrap\"]/ul/li[2]/a")).click();

	}

}

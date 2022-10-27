package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class L10_Assertion_pt2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/");
		driver.findElement(By.linkText("TEST STORE")).click();

		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		driver.findElement(By.xpath("/html//form[@id='add-to-cart-or-refresh']//button[@type='submit']")).click();

		Thread.sleep(5000);

		String price = driver.findElement(By.cssSelector(".product-total .value")).getText();

		Assert.assertEquals("$26.12", price);

	}
}

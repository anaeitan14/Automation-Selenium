package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L04_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.automationtesting.co.uk/dropdown.html");

		System.out.println(driver.findElement(By.cssSelector("#cb_red")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#cb_green")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("#cb_blue")).isSelected());

		driver.get("https://ksp.co.il/web/cat/269..397");

		Thread.sleep(5000);
		boolean res = driver
				.findElement(By.xpath(
						"//*[@id=\"select-root\"]/div[1]/div/div[2]/div[2]/div/div/div/label/span[1]/span[1]/input"))
				.isSelected();
		//
		System.out.println("The check is T/F for ticked " + res);
	}

}

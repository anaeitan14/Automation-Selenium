package Section09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L01_ChromeOptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();

		options.addArguments(" --start-maximized");
		options.addArguments(" --incognito");


		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.automationtesting.co.uk/index.html");

	}

}

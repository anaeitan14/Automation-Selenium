package Section12;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class L04_BasePage {

	public static WebDriver driver;
	private String url;

	public WebDriver getDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\Eitan\\eclipse-workspace\\Selenium Test\\src\\Section12\\L04_config.properties");
		prop.load(data);

		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;
	}

	public String getUrl() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\Eitan\\eclipse-workspace\\Selenium Test\\src\\Section12\\L04_config.properties");
		prop.load(data);
		url = prop.getProperty("url");

		return url;
	}

	public void takeSnapShot(WebDriver driver) throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\Screenshots\\" + timeStamp() + ".png");

		FileUtils.copyFile(srcFile, destFile);
	}

	public static String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handesaim {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eitan\\Downloads\\Selenium Automation\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://yedion.cts.org.il/yedion/fireflyweb.aspx?prgname");
		Thread.sleep(2000);
		driver.findElement(By.id("R1C1")).sendKeys("209850684");
		Thread.sleep(2000);
		driver.findElement(By.id("R1C2")).sendKeys("Eitan15091965");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbtn")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}

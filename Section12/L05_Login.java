package Section12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class L05_Login extends L05_BasePage {

	public L05_Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void signin() throws IOException {
		driver = getDriver();
		driver.get(getUrl());

		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("pewdiepie122@gmail.com");
		driver.findElement(By.cssSelector("section input[name='password']")).sendKeys("emoky94");
		driver.findElement(By.cssSelector("button#submit-login")).click();

		takeSnapShot(driver);

		System.out.println("User has logged in");
	}
}

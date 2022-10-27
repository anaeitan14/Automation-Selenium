package Section12;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class L04_Login2 extends L04_BasePage {

	@Test
	public void signin() throws IOException {
		driver = getDriver();
		driver.get(getUrl());

		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("pewdiepie122@gmail.com");
		driver.findElement(By.cssSelector("section input[name='password']")).sendKeys("emoky94");
		driver.findElement(By.cssSelector("button#submit-login")).click();
		System.out.println("User has logged in");
	}
}

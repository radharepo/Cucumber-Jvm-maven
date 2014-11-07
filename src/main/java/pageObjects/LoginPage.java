package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends AbstractPage {
	
	public LoginPage(WebDriver driver){
		super(driver);
		
	}
	
	public LoginPage fillFormwithData() {
		driver.findElement(By.id("email")).sendKeys("radhasel9@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		return new LoginPage(driver);
	}
	
	public MyfeedPage clickOnLogin() {
		driver.findElement(By.className("btn-login")).click();
		return new MyfeedPage(driver);
	}
}

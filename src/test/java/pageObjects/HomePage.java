package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
	
	private String url = "http://s195:s195@s195.qa1.mobile.sport195.com";
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String getUrl(){
		return this.url;
	}
	
	public void navigateToHomepage() {
		driver.get(this.getUrl());
	}
	
	public LoginPage clickOnLogin(){
		driver.findElement(By.linkText("Log In")).click();
		return new LoginPage(driver);
	}

}

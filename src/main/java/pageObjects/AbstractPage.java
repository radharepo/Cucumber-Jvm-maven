package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AbstractPage {
	
	public WebDriver driver;
	
	public AbstractPage() {
		driver = new FirefoxDriver();
	}
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}	
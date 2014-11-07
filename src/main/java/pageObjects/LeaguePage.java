package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaguePage extends AbstractPage {
	public LeaguePage(WebDriver driver) {
		super(driver);
	}

	public void navigateToResultsPage() {
		driver.findElement(By.cssSelector("a.filter-btn.results")).click();
	}
	
	public void createNewEvent() {
		driver.findElement(By.cssSelector("span.item-name")).click();
	}
}

package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchQueryPage extends AbstractPage {
	
	public String query = "Watir-Webdriver League";

	public SearchQueryPage(WebDriver driver) {
		super(driver);
	}

	public void searchQuery() {
		
		WebElement element_search = driver.findElement(By
				.className("search-query"));
		element_search.sendKeys(query);
		element_search.sendKeys(Keys.ENTER);
	}
	
	public void select_result() {
		List<WebElement> results = driver.findElements(By.className("item-name"));
		 for (WebElement resultitem : results) {
			 if(resultitem.getText().equals(query)) {
				 resultitem.click();
				 break;
			 }
		 }
	}
	
}

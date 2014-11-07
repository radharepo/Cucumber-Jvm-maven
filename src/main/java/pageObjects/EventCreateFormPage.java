package pageObjects;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EventCreateFormPage extends AbstractPage {

	public EventCreateFormPage(WebDriver driver) {
		super(driver);
	}

	public void selectDate() {
		WebElement element = driver.findElement(By.className("picker__input"));
		element.click();
		driver.findElement(By.className("picker__day")).click();
	}

	public void addEventName() {
		driver.findElement(By.cssSelector("input.validation-input")).sendKeys(Keys.ENTER);
		Date date = new Date();
		String nowDate = date.toString();
		WebElement eventName = driver.findElement(By.cssSelector("input.validation-input"));
		eventName.sendKeys("Event Created at | " + nowDate);
	}

	public void selectSportEventtype() {
		/* Locating sportevent type through loop
		
		String requiredType = "Baseball Game";
		List<WebElement> options = driver.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if (option.getText().equals(requiredType)) {
				option.click();
			}
		} */
		driver.findElement(By.xpath(".//div[@class='component-select-dropdown sport-event-type-id form-component']/select/option[2]")).click();
	}
	
	public void selectVenue() {	
		
		WebElement element = driver.findElement(By.name("venue_id"));
		element.click();
		element.sendKeys("Royal Enfield Stadium");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//div[4]/div/div/div[2]/div/div[1]/div[5]/div[2]/ul/li[1]")).click();
					/*
		List<WebElement> titles = driver.findElements(By.xpath(".//div[4]/div/div/div[2]/div/div[1]/div[5]/div[2]/ul/li/a"));
		for(WebElement name : titles) {
			String get_name = name.getAttribute("title");
			if(get_name.equals("Royal Enfield Stadium")) {
				get_name.click();
			}
		}
		*/
			
		/*
		List<WebElement> venues = driver.findElements(By.xpath(".//div[4]/div/div/div[2]/div/div[1]/div[5]/div[2]/ul/li"));
			for (WebElement select_venue : venues) {
				if (select_venue.getClass().equals("acive")){					
				    select_venue.click();
					break;
			}
		} */ 
	}
	
	public void clickOnSave() {
		driver.findElement(By.xpath("//div[2]/div[6]/div/section/div/div[4]/div/div/div[2]/div/div[2]/button")).click();
		/* driver.findElement(By.cssSelector("button.btn.btn-primary.save")); */
	}
}


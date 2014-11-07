package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyfeedPage extends AbstractPage {
	public MyfeedPage(WebDriver driver) {
		super(driver);
	}

	public MyfeedPage click_On_Myfeed_link() {
		driver.findElement(By.linkText("My Feed")).clear();
		return new MyfeedPage(driver);
	}

	public void Myfeed_wall_filter() {

		String[] strings = new String[] {"div.scroll-item.all", "div.scroll-item.news",
				 "div.scroll-item.results", "div.scroll-item.schedules", "div.scroll-item.images",
				 "div.scroll-item.video", "div.scroll-item.comment", "div.scroll-item.activity" };
		 
		for (String string : strings) {		
		   driver.findElement(By.cssSelector(string)).click();
		 }
	}
		 
/*	 
		 for (String item: filteritems) {
			 driver.findElements(By.cssSelector("item").click();
		 }
		 

		List<WebElement> Linklist = driver.findElements(By.cssSelector("div.scroll-item"));
		
		for (int i = 0; i<Linklist.size(); i++) {
			Linklist.get(i).click();
		}

	}
*/
	
	public void clickOnAllFiters(){
		driver.findElement(By.cssSelector("div.scroll-item.all")).click();
		driver.findElement(By.cssSelector("div.scroll-item.news")).click();
		driver.findElement(By.cssSelector("div.scroll-item.results")).click();
		driver.findElement(By.cssSelector("div.scroll-item.schedules")).click();
		driver.findElement(By.cssSelector("div.scroll-item.images")).click();
		driver.findElement(By.cssSelector("div.scroll-item.video")).click();
		driver.findElement(By.cssSelector("div.scroll-item.comment")).click();
		driver.findElement(By.cssSelector("div.scroll-item.activity")).click();
	}
	
	
}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);//switch to frame if its present
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement targetElement = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions action = new Actions(driver);
		
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
			
	}

}

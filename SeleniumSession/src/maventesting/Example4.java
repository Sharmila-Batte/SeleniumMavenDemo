package maventesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utiliity.SeleniumUtility;

public class Example4 {

	public static void main(String[] args) throws InterruptedException {
		/*SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://jqueryui.com/droppable/");

		//to get inside the frame use below statement
		driver.switchTo().frame(0);
		
		//to perform drag and drop first identify source and target
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		util.performDragAndDrop(src, target);	
		*/
		
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("Chrome", "https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		util.performDragAndDrop(src, target);
		
		
	}

}

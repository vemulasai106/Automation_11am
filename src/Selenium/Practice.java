package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Double = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(Double).perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	
	
 }

		
}


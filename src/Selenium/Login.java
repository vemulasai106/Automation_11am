package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		/*driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10));
		Actions ACT = new Actions(driver);
		WebElement Desktop = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement Mac = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		ACT.moveToElement(Desktop).moveToElement(Mac).click().perform();*/
		
		   driver.get("https://demo.automationtesting.in/Alerts.html");
		   Actions Act = new Actions(driver);
		   WebElement Interactions = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		   WebElement DragandDrop = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		   WebElement Dynamic = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
		   Act.moveToElement(Interactions).moveToElement(DragandDrop).moveToElement(Dynamic).click().perform();
		   
		   
		    
			
			
		
	}

}

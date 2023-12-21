package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login1 {

	public static void main(String[] args) {
	    
		WebDriver sai = new EdgeDriver();
		/*driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> SAI = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println(SAI.size());
		for(int i=1; i<SAI.size(); i++)
		{
			SAI.get(i).click();
		}*/
		
		sai.get("https://text-compare.com/");
		Actions sai1 = new Actions(sai);
		sai.findElement(By.name("text1")).sendKeys("selenium is a designing tool for automation");
		sai1.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		sai1.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		sai1.keyDown(Keys.TAB).keyUp(Keys.CONTROL).perform();
		sai1.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		sai.findElement(By.xpath("//*[@id=\"compareButton\"]/div[1]")).click();
		
		   /*driver.get("https://demo.automationtesting.in/Alerts.html");
		   Actions Act = new Actions(driver);
		   WebElement Interactions = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		   WebElement Selectable = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[2]/a"));
		   Act.moveToElement(Interactions).moveToElement(Selectable).click().perform();*/
		
		   /*driver.get("https://demo.automationtesting.in/Alerts.html");
		   Actions Act = new Actions(driver);
		   WebElement Interactions = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		   WebElement DragandDrop = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		   WebElement Dynamic = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
		   Act.moveToElement(Interactions).moveToElement(DragandDrop).moveToElement(Dynamic).click().perform();*/
		
		/*driver.get("https://demo.opencart.com/index.php?route=account/login");
		Actions ACT = new Actions(driver);
		WebElement Desktops = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement  Mac = driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/a[6]"));
		ACT.moveToElement(Desktops).moveToElement(Mac).click().perform();*/
		
	}

}

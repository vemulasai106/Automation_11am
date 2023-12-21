package Selenium;

/*import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;*/

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Window_Handling1 {

	public static void main(String[] args) {
	     
	 WebDriver driver = new EdgeDriver();
	/* driver.get("https://www.amazon.com/");
	 driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10));
	 driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
	 driver.findElement(By.name("email")).sendKeys("9640797296");
	 driver.findElement(By.id("continue")).click();
	 driver.findElement(By.name("password")).sendKeys("Sai@123@");
	 driver.findElement(By.id("signInSubmit")).click();
	 Select title = new Select(driver.findElement(By.name("url")));
	 title.selectByVisibleText("Electronics");
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("electronics");
	 driver.findElement(By.id("nav-search-submit-button")).click();
	 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	 driver.findElement(By.name("submit.addToCart")).click();*/
		
	   //WebDriver driver = new EdgeDriver();
	   driver.get("https://demo.guru99.com/insurance/v1/register.php");
	   driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10));
	   Select title = new Select(driver.findElement(By.name("title")));
	   title.selectByVisibleText("Duke");
	   driver.findElement(By.name("firstname")).sendKeys("Koushik");
	   driver.findElement(By.name("lastname")).sendKeys("Tanmath");
	   driver.findElement(By.name("phone")).sendKeys("9640797296");
	   Select title1  = new Select(driver.findElement(By.name("year")));
	   title1.selectByValue("1939");
	   Select title2 = new Select(driver.findElement(By.name("month")));
	   title2.selectByVisibleText("August");
	   Select title3 = new Select(driver.findElement(By.name("date")));
	   title3.selectByIndex(9);
	   driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[2]/div[4]/label[2]")).click();
	   Select title4 = new Select(driver.findElement(By.name("licenceperiod")));
	   title4.selectByValue("5");
	   Select Title1 = new Select(driver.findElement(By.name("occupation")));
	   Title1.selectByVisibleText("Student");
	   driver.findElement(By.name("street")).sendKeys("Bansvadi");
	   driver.findElement(By.name("city")).sendKeys("Bangalore");
	   driver.findElement(By.xpath("//*[@id=\"user_address_attributes_county\"]")).sendKeys("India");
	   driver.findElement(By.xpath("//*[@id=\"user_address_attributes_postcode\"]")).sendKeys("500324");
	   driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_email\"]")).sendKeys("");
	   driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_password\"]")).sendKeys("Koush123@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"user_user_detail_attributes_password_confirmation\"]")).sendKeys("Koush@123");
	   driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[5]/input[2]")).click();
	    
		
	}

}

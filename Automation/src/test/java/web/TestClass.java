package web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	
	@BeforeMethod
	public void startUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void backOfficeLogin() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com.my");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		WebElement searchButton = driver.findElement(By.className("gLFyf"));
		searchButton.sendKeys("Taylor Swift");
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.tagName("body")), 0, 0);
		Thread.sleep(2000);
		actions.moveByOffset(10, 100).click().build().perform();		
		
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void end() {
		driver.quit();
	}
	
}

package org.college;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Student {
public static void main(String[]args){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAMIL ROSE\\eclipse-workspace\\CollegeInfomation\\Driver\\chromedriver.exe");
			   WebDriver driver = new ChromeDriver();  //Interface
			   driver.get("https://www.flipkart.com/");
			   driver.manage().window().maximize();
			   
			   WebElement user = driver.findElement(By.xpath("//button[text()='✕']")); 
			   user.click();
			   
			   WebElement element = driver.findElement(By.xpath("//div[text()='Electronics']"));
			   Actions acc = new Actions(driver);
			   acc.moveToElement(element).perform();
			   
	
	}
}

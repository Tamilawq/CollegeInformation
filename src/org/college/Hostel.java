package org.college;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hostel {
	public static void main(String[]args) throws Throwable{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAMIL ROSE\\eclipse-workspace\\CollegeInfomation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //Interface
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		
		WebElement simple = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simple.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();  
	}
	}


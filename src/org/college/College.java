package org.college;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class College {

	public static void main(String[]args) throws Throwable {
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TAMIL ROSE\\eclipse-workspace\\CollegeInfomation\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();  //Interface
	   String url = "https://www.facebook.com/";
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.navigate().to(url);
	   Thread.sleep(3000);
	   driver.navigate().back();
	   Thread.sleep(3000);
	   driver.navigate().forward();
	   Thread.sleep(3000);
	   driver.navigate().refresh();   
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		 if (currentUrl.equals(url)) {
			 System.out.println("Entered URL fetched");
		 }
		 else {
			 System.out.println("Fail");
		}
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		
		 driver.close(); //close current tab
		 driver.quit(); //close the all browsers
		 
	   }
	} 

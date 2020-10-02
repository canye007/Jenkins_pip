package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirstScript {

	@Test
	public static void test1() throws InterruptedException {
		
		String expectedTitle="Selenium - Web Browser Automation";
        WebDriver driver;
        
      ///Selenium to find Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACLIFFOR\\Desktop\\SLENIUM\\chromedriver_win32\\chromedriver.exe");
        
        Thread.sleep(2000);
        
//        System.setProperty("webdriver.ie.driver", "C:\\Users\\ACLIFFOR\\Desktop\\SLENIUM\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
       
        /// Initializing Chrome browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().window().fullscreen();
        Thread.sleep(4000);
//        driver = new InternetExplorerDriver(); 
//        driver.manage().window().fullscreen();
        
        ///Launch the Deltek Website
        driver.get("https://www.cgi.com/us/en-us/federal");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".agree-button.eu-cookie-compliance-default-button")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Mergers"));
      ///Launch the Selenium HQ Website
        driver.get("http://www.seleniumhq.org/");
       
        ///Get the Website Title
        String actualTitle = driver.getTitle();
        
        ///Check COnditions for Pass or Fail
        if (actualTitle.contentEquals(expectedTitle)){
                        System.out.println("Pass");
                    } else {
                        System.out.println("Fail");
                    }
 
        // Close the browser
        driver.quit();

	}

}

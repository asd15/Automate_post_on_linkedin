package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///
import org.openqa.selenium.support.ui.Wait;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
        driver.get(" https://in.linkedin.com/");
        
        
        
        //Locate email text input and enter email Using Locator "ID" session_key, asd@test.com
        driver.findElementById("session_key").sendKeys("asd@test.com");
        // Locate password input and enter password Using Locator "ID" session_password, testpassword
        driver.findElementById("session_password").sendKeys("testpassword");
        // Locate Sign In button and click Using Locator "XPath" //button[contains(text(), 'Sign in')]
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
        // Wait until feed is loaded Using Locator "ID" //button[contains(text(), 'Sign in')]
        Thread.sleep(8000);
        // Click "Me" dropdown Using Locator "ID" ember17
        driver.findElementById("ember17").click();
        // Wait until option are visible Using Locator "ID" ember435
        Thread.sleep(1000);
        // Click View Profile Using Locator "ID" ember437
        driver.findElementById("ember437").click();
        // Wait until Profile page is loaded Using Locator "ID" ember460
        Thread.sleep(3000);
        // Locate Profile Views element Using Locator "XPath" //div[contains(@class, 'link-text')]//span[contains(text(), 'profile views')]
        WebElement viewCount = driver.findElement(By.xpath("//div[contains(@class, 'link-text')]//span[contains(text(), 'profile views')]"));
        System.out.println(viewCount.getText());
        // Locate Post impressions element Using Locator "XPath" //div[contains(@class, 'link-text')]//span[contains(text(), 'post impressions')]
        WebElement impressionCount = driver.findElement(By.xpath("//div[contains(@class, 'link-text')]//span[contains(text(), 'post impressions')]"));
        System.out.println(impressionCount.getText());
        // Locate Create Post button Using Locator "ID" navigation-create-post-Create-a-post
        driver.findElementById("navigation-create-post-Create-a-post").click();
        // Wait until Post modal is visible Using Locator "ID" ember691
        Thread.sleep(2000);
        // Input text in text area Using Locator "Class" Name ql-editor ql-blank
        driver.findElementByClassName("ql-editor ql-blank").sendKeys("Hello");
        // Click Post button Using Locator "ID" ember723
        driver.findElementById("ember723");
        // Wait until confirmation is visible  
        Thread.sleep(3000);
    }


}

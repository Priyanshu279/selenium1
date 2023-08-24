package com.selenium.a1;

/**
 * Automation on linkedin for login, search and follow button.
 * @author Priyanshu (Expleo)
 * @since JDK17 24/08/2023
 */ 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linkedin{
    public static void main(String[] args) throws Exception{
        		
    			//Browser setup
    			System.setProperty("webdriver.chrome.driver", "C:\\Users\\psuryavanshi2\\Downloads\\chromedriver-win64\\chromedriver.exe");
    			ChromeOptions co=new ChromeOptions();
    			co.setBinary("C:\\Users\\psuryavanshi2\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
    			WebDriver driver=new ChromeDriver(co);
                
                //Test_case1
                //Login to linkedin
                driver.get("https://in.linkedin.com/");
                Thread.sleep(3000);
                driver.manage().window().maximize();
                driver.findElement(By.id("session_key")).sendKeys("Gauravdandekar0071@gmail.com");
                driver.findElement(By.id("session_password")).sendKeys("#Gaurav@123");
                driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
                
                //Test_case 2
                Thread.sleep(3000);
                driver.findElement(By.xpath("//*[@id=\"global-nav-typeahead\"]/input")).sendKeys("Expleo",Keys.ENTER);           
                
                //Test_Case 3
                Thread.sleep(3000);                
                WebElement followButton=driver.findElement(By.id("ember219"));
                
                String fol = followButton.getText();
                
                if(fol.equalsIgnoreCase("following")){
                	System.out.println("Already followed");                   
                }else{
                	followButton.click();
                }
                
    }
}
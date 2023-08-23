package com.selenium.a1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Automation on chrome for flipkart search and checkbox button for searching and printing samsung F series phones only
 * @author Priyanshu (Expleo)
 * @since JDK17 23/08/2023
 */ 

public class Flipkart{
	
    public static void main( String[] args ) throws Exception{
    	//Browser setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\psuryavanshi2\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\psuryavanshi2\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driverFlipkart=new ChromeDriver(co);
		
		//Opening the flipkart site
		driverFlipkart.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		// Maximizing the window
		driverFlipkart.manage().window().maximize();
		
		// Closing the login body
		driverFlipkart.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		// Searching mobiles on flipkart searchbar
		driverFlipkart.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		Thread.sleep(3000);
		
		// Selecting the samsung checkbox
		driverFlipkart.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]")).click();
		Thread.sleep(3000);
		
		//Printing Samsung Phones of F-series only
		List<WebElement> data = driverFlipkart.findElements(By.className("_4rR01T"));
		for(WebElement webElement:data) {
			if(webElement.getText().contains("F"))
			System.out.println(webElement.getText());
		}
		
		//Scroll the page
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driverFlipkart;
		//Scroll down
		jsExecutor.executeScript("window.scrollBy(0,10000)","");
		Thread.sleep(3000);
		//Scroll up
		jsExecutor.executeScript("window.scrollBy(0,-10000)","");
		
		// Closing the window
		driverFlipkart.quit();
    }
}

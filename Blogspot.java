package com.selenium.a1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Automation on chrome for given site and doing operations on checkbox and radiobutton.  
 * @author Priyanshu (Expleo)
 * @since JDK17 23/08/2023
 */ 

public class Blogspot{
	
    public static void main( String[] args ) throws Exception{
    		//Browser setup
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\psuryavanshi2\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.setBinary("C:\\Users\\psuryavanshi2\\Downloads\\chromedriver-win64\\chrome-win64\\chrome.exe");
		WebDriver driverBlogspot=new ChromeDriver(co);
		
		//Opening the site
		driverBlogspot.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		Thread.sleep(3000);
		
		// Maximizing the window
		driverBlogspot.manage().window().maximize();
		
		// Checking red checkbox enabled or not
		WebElement redEnabled = driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		boolean isRedEnabled = redEnabled.isEnabled();
		
		if(isRedEnabled) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		// Checking red checkbox selected or not
		WebElement redSelected = driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		boolean isredSelected = redSelected.isSelected();
		
		if(isredSelected){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		// Selecting orange,green,purple checkbox
		driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]")).click();
		driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]")).click();
		driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]")).click();
		
		// Checking internet explorer radiobutton selected or not
		WebElement internetExplorerSelected = driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
		boolean isInternetExplorer = internetExplorerSelected.isSelected();
		
		if(isInternetExplorer) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		// Checking opera radiobutton selected or not
		WebElement operaSelected = driverBlogspot.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]\r\n"));
		boolean isOperaSelected = operaSelected.isSelected();
		
		if(isOperaSelected) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		// Closing the window
		driverBlogspot.quit();
    }
}

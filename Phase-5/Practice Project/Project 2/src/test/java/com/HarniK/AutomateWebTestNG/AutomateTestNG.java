package com.HarniK.AutomateWebTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


import io.github.bonigarcia.wdm.WebDriverManager;


public class AutomateTestNG {
	WebDriver wd;
	//test case is pass without any assert-by checking the flow 
	@Test(priority = 1)
	  public void register() throws InterruptedException {
		
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		wd.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
	      wd.findElement(By.id("createAccountSubmit")).click();
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_customer_name")).sendKeys("ABCDEF");
	      Thread.sleep(5000);
	      //wd.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_email")).sendKeys("ABCDEF@gmail.com");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_password")).sendKeys("12345678");
	      Thread.sleep(5000);
	      wd.findElement(By.id("ap_password_check")).sendKeys("12345678");
	      Thread.sleep(5000);
	     wd.findElement(By.id("continue")).click();
	}
	
	      @Test(priority = 2)
	  public void login() throws InterruptedException {
		
		

		 wd.findElement(By.id("nav-link-accountList")).click();
		 Thread.sleep(5000);
	     wd.findElement(By.id("ap_email")).sendKeys("ABCDEF@gmail.com");
	     Thread.sleep(5000);
		  wd.findElement(By.id("continue")).click();
		  Thread.sleep(5000);
	     wd.findElement(By.id("ap_password")).sendKeys("12345678");
	       


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		  
	      	
		    System.out.println(wd.getTitle());
		    System.out.println(wd.getCurrentUrl());
		    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		    Thread.sleep(5000);
		    wd.findElement(By.id("nav-search-submit-button")).submit();
		    Thread.sleep(5000);
		    wd.findElement(By.xpath("//*[contains(@src,'https://m.media-amazon.com/images/I/71gjvIjO4ZL._AC_UL320_.jpg')]")).click();
		    Thread.sleep(5000);
		   
		   //WebElement e1= wd.findElement(By.id("a-autoid-20-announce"));
		   // WebDriverWait wait =  new WebDriverWait(wd, 10);
			 
			//wait.until(ExpectedConditions.visibilityOf(e1));
		   // e1.click();
	  }
	 
	  @BeforeMethod
	    public void startbrowser()
	    {
		  WebDriverManager.chromedriver().setup();
		  	 wd=new ChromeDriver();
	      	wd.get("https://www.amazon.in/");
	      	 wd.manage().window().maximize();
	      	   
	    }



	      @AfterMethod
	    public void closeBrowser()
	    {
	        wd.close();
	    }
	  

}
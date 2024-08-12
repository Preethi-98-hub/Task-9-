package com.seleniumconecpts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firstseleniumscript {
  public static void main(String[] args) {
	  
    //set up the Firefox Browser
	  FirefoxDriver driver=new FirefoxDriver();
	  
	//to maximize the window
	  driver.manage().window().maximize();
	  
	//load the url
	  driver.get("https://www.google.com/");
	  
	  
	// Print the URL of the current page
      String currentUrl = driver.getCurrentUrl();
      System.out.println("Current URL: " + currentUrl);
      
      // Reload the page
      driver.navigate().refresh();
	  
	 
	  driver.close();
	  
  }
}

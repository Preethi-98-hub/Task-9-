package com.seleniumconecpts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Thirdseleniumscript {

	public static void main(String[] args) throws InterruptedException {
		// Initialize a new ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();
        
        // Navigate to the specified URL
        driver.get("https://www.wikipedia.org/");

        // Maximize the browser window
        driver.manage().window().maximize();
     // Find the search input element by its name attribute
        WebElement searchInput = driver.findElement(By.name("search"));
        
        // Enter the search query "Artificial Intelligence"
        searchInput.sendKeys("Artificial Intelligence");
        
        // Submit the search form
        searchInput.submit();
        
       //Locating an element
        Thread.sleep(1000);
        WebElement historyLink = driver.findElement((By.linkText("History")));
        
        // Click on the "History" link
        historyLink.click();
        
        // Wait until the "History" section is loaded
        Thread.sleep(1000);
        WebElement historySection = driver.findElement((By.id("History")));
        
        // Print the title of the section
        System.out.println("Section Title: " + historySection.getText());
    } 
        
}
	



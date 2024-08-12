package com.seleniumconecpts;

import org.openqa.selenium.chrome.ChromeDriver;

public class secondseleniumscript {

	public static void main(String[] args) {
		// Initialize a new ChromeDriver instance
        ChromeDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("https://www.demoblaze.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Verify if the title is "STORE"
        if (pageTitle.equals("STORE")) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }

        // Close the browser
        driver.close();
    }

	}



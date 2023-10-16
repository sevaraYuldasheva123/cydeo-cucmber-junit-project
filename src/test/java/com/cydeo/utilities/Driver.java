package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    //driver is private so there is no access from outside of the class
    //static is becatuse we need the static methods
    private static WebDriver driver;

    //create a private constructor to lock the access to this object
    private Driver(){ // default value is null
    }

    //creating reusable utility method that will return the same driver instance once we call it
    //if an instance doesnt exist, it will create , and then it will always return same instance
    public static WebDriver getDriver(){

        if ( driver == null){
            //we will read our browser from configuration.properties type of file
            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType){
                case "chrome":
                case "Chrome":
                    //WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "safari":
                case "Safari":
                    //WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                case "Firefox":
                    //WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                default:
                    System.out.println("Invalid browser type indicated");
            }
        }

        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.quit(); // if driver is not closed this line will kill the in stance of the driver
            driver = null; //this line assigns the value to null again so the next time driver can be used
        }


    }
}

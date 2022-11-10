package com.krafttechnologie.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverCreator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //task
    //write a static method that takes a string parameter name: browserType
    //it will setup the browser
    // and the method will return chromedriver or firefoxdriver
    // name of the method : getDriver



    public static WebDriver getDriver(String browserType){   // bu methodu day1 de CallWebDriverFaytory de çağırdık.
        WebDriver driver = null;

        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
        }
        return driver;
    }




}

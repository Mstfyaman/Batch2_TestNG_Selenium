package com.krafttechnologie.tests.day4_Xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com");
      //  driver.manage().window().maximize();

        String accualText= driver.findElement(By.xpath("/html/body/main/div/h1")).getText();
        // burda child classtan parrent classa doğru yazdık.  bunu kısayol olarak siteden copy=full xpath ile alabiliriz.
        System.out.println("accualText = " + accualText);


    }
}

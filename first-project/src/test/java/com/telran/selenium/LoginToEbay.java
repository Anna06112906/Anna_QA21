package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.lang.ref.PhantomReference;

public class LoginToEbay  {
    @Test
    public void LoginTest() {
        WebDriver driver = null;
        driver.get("https://www.ebay.com");
        click(By.id("gh-ug"));

        click(By.id("userid"));
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("addfgh@ghghj.com");

        click(By.id("pass"));
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("123456789");

        click(By.id("sgnBt"));

    }

    public void click(By locator) {
        click(locator);
    }
}

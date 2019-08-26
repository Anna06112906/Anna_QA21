package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToWikipedia extends TestBase {
    @Test
    public void LoginTestWiki() {

        click(By.id("pt-login"));

        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("asdfg.@gkhiyo.com");

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("123345h");

        click(By.id("wpLoginAttempt"));


    }

}

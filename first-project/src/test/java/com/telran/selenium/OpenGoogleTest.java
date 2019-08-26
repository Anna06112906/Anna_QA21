package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenGoogleTest extends TestBase {

    @Test
    public void searchJavaTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        click(By.name("q"));
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("java" + Keys.ENTER);

        Thread.sleep(3000);
    }

    @Test
    public void clicklmfillingLucky() {

        click(By.name("btnI"));
    }
}

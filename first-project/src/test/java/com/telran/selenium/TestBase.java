package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org");
    }

    @AfterClass
        public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}

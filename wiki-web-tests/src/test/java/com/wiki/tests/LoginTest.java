package com.wiki.tests;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void preconditions(){
        if(!app.getSession().isElementPresent(By.id("pt-login"))){
            app.getSession().openSite("https://en.wikipedia.org");
        }
    }

    @Test
    public void loginTest() {
        app.getSession().initLogin();
        app.getSession().fillLoginForm("ghjhgjgjh@jhjhgj.com", "123455678G");
        app.getSession().confirmLogin();
    }

    @AfterMethod
    public void postActions(){
        app.getSession().openSite("https://en.wikipedia.org");
    }


}

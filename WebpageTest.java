package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000); // Optional: useful for visual debugging
        driver.get("https://christen24.github.io/Project-2-Maven/");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Simple Website";
        System.out.println("Actual title: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected.");
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000); // Optional: helps you see the browser before it closes
        driver.quit();
    }
}

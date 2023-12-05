package com.tutorial.demo.testbase;

import com.tutorial.demo.propertyreader.PropertyReader;
import com.tutorial.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);

    }

    @AfterMethod
    public void tearDown() {

        closeBrowser();
    }
}

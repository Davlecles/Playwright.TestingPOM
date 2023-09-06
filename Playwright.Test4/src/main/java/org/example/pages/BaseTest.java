package org.example.pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Tracing;
import org.example.factory.PlaywrightFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.nio.file.Paths;

// BaseTest class for setting up and tearing down Playwright test environment
public class BaseTest extends PlaywrightFactory{

    // Playwright Page object for web automation
    protected Page page;

    // Page objects for different application pages
    protected HomePage homePage;
    protected SimpleFormDemoPage simpleFormDemoPage;
    protected CheckboxPage checkboxPage;

    // Factory for creating Playwright objects and navigating to web pages
    protected PlaywrightFactory playwrightFactory;

    // Setup method to initialize Playwright and navigate to the home page
    @BeforeTest
    public void setup() {
        playwrightFactory = new PlaywrightFactory();
        page = playwrightFactory.getPage();
        homePage = new HomePage(page);
    }

    // Teardown method to close the browser after the test
    @AfterTest
    public void tearDown() {
        page.context().browser().close();
    }
}

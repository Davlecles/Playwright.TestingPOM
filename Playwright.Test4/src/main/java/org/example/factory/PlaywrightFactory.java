package org.example.factory;
import com.microsoft.playwright.*;

import java.nio.file.Paths;

// Factory class for creating Playwright objects and navigating to a web page
public class PlaywrightFactory {

    // Playwright instance to manage browser automation
    protected Playwright playwright;

    // Represents a web page
    protected Page page;

    // Represents a web browser
    protected Browser browser;

    // Represents a browser context
    protected BrowserContext browserContext;

    // Create and return a Playwright Page object for web automation
    public Page getPage() {

        // Create a new Playwright instance
        playwright = Playwright.create();

        // Launch a Chromium browser with specific options
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setChannel("chrome")   // Set browser channel
                        .setHeadless(false));   // Run browser in non-headless mode

        // Create a new browser context
        browserContext = browser.newContext();

        // Create a new page within the context and navigate to a web page
        page = browserContext.newPage();
        page.navigate("https://www.lambdatest.com/selenium-playground/");

        // Return the created Page object
        return page;
    }
}
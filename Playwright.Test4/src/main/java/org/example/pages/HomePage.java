package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {

    // Playwright Page object for the web page
    private final Page page;

    // Locators for links on the page
    private final Locator linkToSimpleFormDemo;
    private final Locator linkToCheckBoxDemo;

    // Constructor to initialize the page and locators
    public HomePage(Page page){
        this.page = page;
        linkToSimpleFormDemo = page.getByText("Simple Form Demo");
        linkToCheckBoxDemo = page.getByText("Checkbox Demo");
    }

    // Method to follow the link to the Simple Form Demo page
    public SimpleFormDemoPage followLinkToSimpleFormDemoPage(){
        linkToSimpleFormDemo.click();
        // Return a new instance of SimpleFormDemoPage for further actions
        return new SimpleFormDemoPage(page);
    }

    // Method to follow the link to the Checkbox Demo page
    public CheckboxPage followLinkToCheckboxPage(){
        linkToCheckBoxDemo.click();
        // Return a new instance of CheckboxPage for further actions
        return new CheckboxPage(page);
    }
}


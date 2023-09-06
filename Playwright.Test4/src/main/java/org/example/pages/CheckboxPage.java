package org.example.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import java.util.regex.Pattern;

public class CheckboxPage {

    // Playwright Page object for the web page
    private final Page page;

    // Locators for checkboxes on the page
    private final Locator multipleCheckbox1;
    private final Locator multipleCheckbox4;

    // Constructor to initialize the page and locators
    public CheckboxPage(Page page){
        this.page = page;
        multipleCheckbox1 = page.getByLabel("Option 1");
        multipleCheckbox4 = page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Option 1Option 2Option 3Option 4Check All$"))).getByRole(AriaRole.CHECKBOX).nth(3);
    }

    // Method to click the first checkbox
    public void clickMultipleCheckbox1(){
        multipleCheckbox1.check();
    }

    // Method to click the fourth checkbox
    public void clickMultipleCheckbox4(){
        multipleCheckbox4.check();
    }

    // Method to return the first checkbox locator
    public Locator getMultipleCheckbox1Locator() {
        return multipleCheckbox1;
    }

    // Method to return the fourth checkbox locator
    public Locator getMultipleCheckbox4Locator() {
        return multipleCheckbox4;
    }
}














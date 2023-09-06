package org.example.pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class SimpleFormDemoPage {

    // Playwright Page object for the web page
    private final Page page;

    // Locators for elements on the page
    private final Locator messageField;
    private final Locator getCheckedValueButton;
    private final Locator displayMessageResult;

    // Constructor to initialize the page and locators
    public SimpleFormDemoPage(Page page){
        this.page = page;
        messageField = page.getByPlaceholder("Please enter your Message");
        getCheckedValueButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Get Checked Value"));
        displayMessageResult = page.locator("//*[@id='message']");
    }

    // Method to type a message into the input field
    public void typeMessageIntoInputField(String input){
        messageField.click();
        messageField.fill(input);
    }

    // Method to click the "Get Checked Value" button
    public void clickGetCheckedValueButton(){
        getCheckedValueButton.click();
    }

    // Method to retrieve and return the displayed message
    public String getDisplayMessage(){
        return displayMessageResult.textContent();
    }
}


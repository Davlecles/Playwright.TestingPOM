package org.example.tests;
import com.microsoft.playwright.Tracing;
import org.example.pages.BaseTest;
import org.example.pages.HomePage;
import org.example.pages.SimpleFormDemoPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.nio.file.Paths;


public class SimpleFormDemoTests extends BaseTest {

    @Test
    public void SimpleFormDemo_enterInput_shouldDisplayInput(){
        // Given
        String testMessage = "Hej";

        // When
        simpleFormDemoPage = homePage.followLinkToSimpleFormDemoPage();
        simpleFormDemoPage.typeMessageIntoInputField(testMessage);
        simpleFormDemoPage.clickGetCheckedValueButton();
        String result = simpleFormDemoPage.getDisplayMessage();


        // Then
        Assert.assertEquals(result, testMessage);
    }

}

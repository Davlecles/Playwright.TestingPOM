package org.example.tests;

import org.example.pages.BaseTest;
import org.example.pages.CheckboxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CheckboxTests extends BaseTest {

    @Test
    public void checkbox_checkBox1and4_shouldCheckBoxes(){
        // Given

        // When
        checkboxPage = homePage.followLinkToCheckboxPage();
        checkboxPage.clickMultipleCheckbox1();
        checkboxPage.clickMultipleCheckbox4();

        //Then
        assertThat(checkboxPage.getMultipleCheckbox1Locator()).isChecked();
        assertThat(checkboxPage.getMultipleCheckbox4Locator()).isChecked();
    }
}

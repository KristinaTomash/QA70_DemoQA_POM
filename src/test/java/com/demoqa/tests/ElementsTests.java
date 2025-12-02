package com.demoqa.tests;

import com.demoqa.core.TestBase;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.JSExecutor;
import com.demoqa.pages.SidePanel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElementsTests extends TestBase {

    SidePanel sidePanel;
    @BeforeEach
    public void precondition(){
        new HomePage(driver).selectElements();
        sidePanel = new SidePanel(driver);

    }
    @Test
    public void jsExecutorTest(){
        sidePanel.selectTextBox();
        new JSExecutor(driver).enterPersonalData("Kris Tomash","Test@gmail.com")
                .clickOnSubmitButton()
                .getInnerText()
                .verifyUrl()
                .refreshPage()
                .navigateToNewTab("https://telranedu.web.app")
                .verifyNewPageIconTitle()
                ;


    }
}

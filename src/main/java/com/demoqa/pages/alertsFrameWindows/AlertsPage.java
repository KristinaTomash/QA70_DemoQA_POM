package com.demoqa.pages.alertsFrameWindows;

import com.demoqa.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id = "timerAlertButton")
    WebElement timerAlertButton;

    public AlertsPage verifyAlertWithTime() {
        clickWithJS(timerAlertButton,0,300);
        Assertions.assertTrue(isAlertPresent(5));
        return this;
    }
@FindBy(id = "confirmButton")
WebElement confirmButton;
    public AlertsPage clickOnConfirmButton() {
        clickWithJS(confirmButton,0,300);
        return this;
    }

    public AlertsPage selectResult(String result) {
        if(result != null && result.equals("Ok")){
            driver.switchTo().alert().accept();
        }else if (result != null && result.equals("Cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
        @FindBy(id = "confirmResult")
        WebElement confirmResult;

    public AlertsPage verifyResult(String text) {
        Assertions.assertTrue(isContains(text, confirmResult));
        return this;
    }

}

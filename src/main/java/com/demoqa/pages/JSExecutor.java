package com.demoqa.pages;

import com.demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class JSExecutor extends BasePage {

    public JSExecutor(WebDriver driver) {
        super(driver);
    }

    public JSExecutor enterPersonalData(String name, String email) {
        js.executeScript("document.getElementById('userName').value='"+ name + "';");
        js.executeScript("document.getElementById('userName').style.border='5px solid green';");
        js.executeScript("document.getElementById('userEmail').value='"+ email + "';");
        js.executeScript("document.getElementById('userEmail').style.border='3px solid red';");
        return this;
    }

    public JSExecutor clickOnSubmitButton() {
        js.executeScript("document.querySelector('#submit').click();");
        js.executeScript("document.querySelector('#submit').style.backgroundColor='red';");
        return this;
    }

    public JSExecutor getInnerText() {
        String innerText = js.executeScript("return document.documentElement.innerText;").toString();
        System.out.println(innerText);
        System.out.println("============================");
        return this;
    }

    public JSExecutor verifyUrl() {
        String url = js.executeScript("return document.URL;").toString();
        System.out.println("URL = " + url);
        System.out.println("==========================================");
        return this;
    }

    public JSExecutor refreshPage() {
        js.executeScript("history.go(0);");
        return this;
    }

    public JSExecutor navigateToNewTab(String url) {
        js.executeScript("window.location='"+ url + "';");
        return this;
    }

    public JSExecutor verifyNewPageIconTitle() {
        String iconTitle = js.executeScript("return document.title;").toString();
        System.out.println("iconTitle -> "+ iconTitle);
        return this;
    }
}

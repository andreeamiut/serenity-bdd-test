package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private static final By USERNAME_FIELD = By.id("username");
    private static final By PASSWORD_FIELD = By.id("login");
    private static final By LOGIN_BUTTON = By.cssSelector("button.action-login");
    private static final By ERROR_MESSAGE = By.cssSelector(".message-error");

    public void enterUsername(String username) {
        $(USERNAME_FIELD).type(username);
    }

    public void enterPassword(String password) {
        $(PASSWORD_FIELD).type(password);
    }

    public void clickLoginButton() {
        $(LOGIN_BUTTON).click();
    }

    public boolean isErrorMessageDisplayed() {
        return $(ERROR_MESSAGE).isDisplayed();
    }

    public String getErrorMessage() {
        return $(ERROR_MESSAGE).getText();
    }

    public org.openqa.selenium.WebElement getErrorMessageElement() {
        return $(ERROR_MESSAGE);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
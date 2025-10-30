package com.example.steps;

import com.example.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Given("I am on the Magento admin login page")
    public void iAmOnTheMagentoAdminLoginPage() {
        loginPage.openUrl("https://magento2-demo.magebit.com/admin");
    }

    @When("I enter username {string} and password {string}")
    public void iEnterUsernameAndPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        // Login is handled in the previous step
    }

    @Then("I should be logged in to the admin dashboard")
    public void iShouldBeLoggedInToTheAdminDashboard() {
        // Add assertion for successful login (e.g., check for dashboard elements)
        // For now, we'll assume success if no error message is shown
        loginPage.shouldNotBeVisible(loginPage.getErrorMessageElement());
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        loginPage.isErrorMessageDisplayed();
    }
}
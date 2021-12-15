package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @When("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String user)  {
        new LoginPage().selectUserName(user);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new LoginPage().selectPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I can see welcome message$")
    public void iCanSeeWelcomeMessage() {
        new HomePage().verifyWelcomeText();
    }

    @And("^I can see orange logo$")
    public void iCanSeeOrangeLogo() {
        String expectedLogo = new HomePage().OrangeHRMLogo();
        String actualLogo = new HomePage().OrangeHRMLogo();
        Assert.assertEquals(actualLogo,expectedLogo);

    }



    @And("^I click on welcome$")
    public void iClickOnWelcome() {
        new HomePage().clickOnWelcomeUser();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("^I see a login panel message$")
    public void iSeeALoginPanelMessage() {
        org.junit.Assert.assertEquals("LOGIN Panel",new LoginPage().getTextLoginPannel());
    }
}

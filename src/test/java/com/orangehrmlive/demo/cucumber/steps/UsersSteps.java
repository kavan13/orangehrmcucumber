package com.orangehrmlive.demo.cucumber.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsersSteps {
    @And("^I click on admin tab$")
    public void iClickOnAdminTab() {
        new AdminPage().clickOnAdmin();
    }

    @And("^I click on add button$")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickOnAddButton();

    }



    @And("^I select user role \"([^\"]*)\"$")
    public void iSelectUserRole(int value)  {
        new AddUserPage().selectUserRoleAdmin(value);
    }

    @And("^I enter employee name \"([^\"]*)\"$")
    public void iEnterEmployeeName(String name)  {
        new AddUserPage().selectEmployeananyadash(name);
    }

    @And("^I enter my username \"([^\"]*)\"$")
    public void iEnterMyUsername(String name)  {
        new AddUserPage().EnterUserName(name);
    }

    @And("^I select status \"([^\"]*)\"$")
    public void iSelectStatus(String value)  {
        new AddUserPage().selectstatus(value);

    }

    @And("^I set password \"([^\"]*)\"$")
    public void iSetPassword(String password)  {
        new AddUserPage().selectPassword(password);

    }

    @And("^I set confirm password \"([^\"]*)\"$")
    public void iSetConfirmPassword(String password)  {
        new AddUserPage().selectConfirmPassword(password);
    }

    @And("^I click on save button$")
    public void iClickOnSaveButton() {
        new AddUserPage().selectSaveButtom();
    }

    @And("^I enter name in search field \"([^\"]*)\"$")
    public void iEnterNameInSearchField(String name)  {
        new ViewSystemUsersPage().selectUsernameField(name);

    }

    @And("^I select user roll drop down \"([^\"]*)\"$")
    public void iSelectUserRollDropDown(int value)  {
        new ViewSystemUsersPage().selectUserRollDropDown(value);
    }

    @And("^I enter status as \"([^\"]*)\"$")
    public void iEnterStatusAs(int value)  {
        new ViewSystemUsersPage().selectStatusDropDown(value);

    }

    @And("^I click to search$")
    public void iClickToSearch() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("^i can see user is in result list$")
    public void iCanSeeUserIsInResultList() {
        String expectedMessage2 = new ViewSystemUsersPage().getVerifyUserResult();
        String actualMessage2 = new ViewSystemUsersPage().getVerifyUserResult();
        Assert.assertEquals(actualMessage2, expectedMessage2);
    }

    @And("^I enter a user name \"([^\"]*)\"$")
    public void iEnterAUserName(String name)  {
        new ViewSystemUsersPage().selectUsernameField(name);


    }

    @And("^I set his role \"([^\"]*)\"$")
    public void iSetHisRole(int value)  {
        new ViewSystemUsersPage().selectUserRollDropDown(value);
    }

    @And("^I set his status \"([^\"]*)\"$")
    public void iSetHisStatus(int value)  {
        new ViewSystemUsersPage().selectStatusDropDown(value);
    }

    @And("^I marked in check box$")
    public void iMarkedInCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @And("^I click on delete button$")
    public void iClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOndeleteButton();
    }

    @And("^I click on pop up$")
    public void iClickOnPopUp() {
        new ViewSystemUsersPage().clickOnPopUpButton();
    }

    @And("^I can see no record found$")
    public void iCanSeeNoRecordFound() {
        String expectedMessage2 = "No Records Found";
        String actualMessage2 = new ViewSystemUsersPage().getVerifyNoRecordFound();
        Assert.assertEquals(actualMessage2,expectedMessage2);

    }

    @Then("^I can see Add User text$")
    public void iCanSeeAddUserText() {
        String expectedMessage2 = "Add User";
        String actualMessage2 = new AddUserPage().getTextAddUser();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Add User");

    }
}

package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());

    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='systemUser-information']//a[@href='#']")
    WebElement systemUsersText;////a[contains(text(),'>')]
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userNameField;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRoll;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employNameField;

    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusDropDown;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButton;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addButton;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;
    @FindBy(xpath = "//input[@name='chkSelectRow[]']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popUpButton;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement verifyUserResult;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordMsg;

    public String getTextsystemUser() {
        String message = getTextFromElement(systemUsersText);
        log.info("get Text system User : "  + systemUsersText.toString());
        return message;
    }

    public void selectUsernameField(String text) {
        sendTextToElement(userNameField, text);
        log.info("Select user name field :  "  + userNameField.toString());
    }

    public void selectUserRollDropDown(int value) {
        selectByIndexFromDropDown(userRoll,value);
        log.info("Select user roll"  + userRoll.toString());
    }

    public void selectEmployNameField(String value) {
        selectByValueFromDropDown(employNameField, value);
        log.info("Select Employee name : "  + employNameField.toString());
    }

    public void selectStatusDropDown(int value) {
        selectByIndexFromDropDown(statusDropDown, value);
        log.info("Select Status : "  + statusDropDown.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        log.info("click on Search button : "  + searchButton.toString());
    }

    public void clickOnrestButton() {
        clickOnElement(resetButton);
        log.info("click on Reset Button : "  + resetButton.toString());
    }

    public void clickOnAddButton() {
        clickOnElement(addButton);
        log.info("click on add Button : "  + addButton.toString());
    }

    public void clickOndeleteButton() {
        clickOnElement(deleteButton);
        log.info("click on delete Button : "  + deleteButton.toString());
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
        log.info("click on check box : "  + checkBox.toString());
    }

    public void clickOnPopUpButton() {
        clickOnElement(popUpButton);
        log.info("click on PopUp button : "  + popUpButton.toString());
    }

    public String getVerifyUserResult() {
        String message = getTextFromElement(verifyUserResult);
        log.info("Verify user Result : "  + verifyUserResult.toString());
        return message;

    }

    public String getVerifyNoRecordFound() {
        String message = getTextFromElement(noRecordMsg);
        log.info("Get Text No Record Found : "  + noRecordMsg.toString());
        return message;

    }


}

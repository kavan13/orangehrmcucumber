package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUsersText;
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleAdmin;
    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement ananyaDash;


    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement username;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement disable;
    // By statusDropDown = By.xpath("//select[@id='systemUser_status']");//valu drop
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancleButton;


    public String getTextAddUser() {
        String message = getTextFromElement(addUsersText);
        log.info("Get text Add User : "  + addUsersText.toString());
        return message;
    }

    public void selectUserRoleAdmin(int value) {
        selectByIndexFromDropDown(userRoleAdmin, value);
        log.info("select User Role : "  + userRoleAdmin.toString());

    }

    public void selectEmployeananyadash(String text) {
        sendTextToElement(ananyaDash, text);
        log.info("Select Employee : "  + ananyaDash.toString());
    }

    public void EnterUserName(String text) {
        sendTextToElement(username, "Kavan"+getRandomString(3));
        log.info("Enter User Name : "  + username.toString());
    }

    public void selectstatus(String text) {
        selectByValueFromDropDown(disable, text);
        log.info("Select Status: "  + disable.toString());
    }

    public void selectPassword(String text) {
        sendTextToElement(password, text);
        log.info("Select Password : "  + password.toString());
    }

    public void selectConfirmPassword(String text) {
        sendTextToElement(confirmPassword, text);
        log.info("Select confirm password : "  + confirmPassword.toString());

    }

    public void selectSaveButtom() {
        clickOnElement(saveButton);
        log.info("Select save button : "  + saveButton.toString());
    }

    public void selectCancleButtom() {
        clickOnElement(cancleButton);
    }


}

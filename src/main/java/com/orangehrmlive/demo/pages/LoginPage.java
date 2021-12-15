package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;
    @FindBy (xpath = "//input[@id='txtPassword']")
        WebElement password;
    @FindBy (xpath = "//input[@id='btnLogin']")
        WebElement loginbutton;
    @FindBy (xpath = "//div[@id='logInPanelHeading']")
          WebElement loginpanelText;

    public void selectUserName(String text){
        sendTextToElement(username,text);
        log.info("Select User name : "  + username.toString());

    }
    public void selectPassword(String text){
        sendTextToElement(password,text);
        log.info("Select Password : "  + password.toString());

    }
    public void clickOnLoginButton(){
        clickOnElement(loginbutton);
        log.info("click on Login Button"  + loginbutton.toString());

    }
    public String getTextLoginPannel(){
        String message= getTextFromElement(loginpanelText);
        log.info("Get Text Login Panel"  + loginpanelText.toString());
        return message;
    }

}

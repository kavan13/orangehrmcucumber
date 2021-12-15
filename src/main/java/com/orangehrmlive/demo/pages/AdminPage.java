package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());

    public AdminPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement clickAdmin;
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement job;

    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organization;

    public void clickOnAdmin() {
        clickOnElement(clickAdmin);
        log.info("click on Admin : "  + clickAdmin.toString());

    }

    public void hoverOnUserManagement() {
        mouseHoverToElement(userManagement);
    }

    public void hoverOnJob() {
        mouseHoverToElement(job);
    }

    public void hoverOnOrganization() {
        mouseHoverToElement(organization);
    }

}

package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement orangehrmlogo;
    @FindBy (xpath = "//b[normalize-space()='Admin']")
           WebElement admin;
    @FindBy (xpath = "//b[normalize-space()='PIM']")
           WebElement pim;
    @FindBy (xpath = "//b[normalize-space()='Leave']")
           WebElement leave;
    @FindBy (xpath = "//b[normalize-space()='Dashboard']")
           WebElement dadhboard;
    @FindBy (xpath = "//a[@id='welcome']")
           WebElement welcometext;
    @FindBy (xpath = "//a[contains(text(),'Logout')]")
           WebElement logout;


    public String OrangeHRMLogo(){
        String message =getTextFromElement(orangehrmlogo);
        log.info("Verify Orange Logo : "  + orangehrmlogo.toString());
        return message;
    }
    public void clickOnAdmin(){clickOnElement(admin);
        log.info("click on Admin"  + admin.toString());

    }
    public void clickOnPim(){clickOnElement(pim);
    }
    public void clickOnLeave(){clickOnElement(leave);
    }
    public void clickOnDashboard(){clickOnElement(dadhboard);
    }
    public void clickOnWelcomeUser(){clickOnElement(welcometext);
        log.info("click on Welcome User : "  + welcometext.toString());

    }
    public void clickOnLogOutLink(){clickOnElement(logout);
        log.info("click on LogOut Link"  + logout.toString());

    }
    public String getTextWelcome(){
        String message =getTextFromElement(welcometext);
        log.info("get Text Welcome: "  + welcometext.toString());
        return message;}

    public void verifyWelcomeText() {
        verifyIfActualTextOfElementContainsExpectedText(welcometext,"Welcome");
    }

}

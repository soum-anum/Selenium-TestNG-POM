package com.automationexercise.pages;

import com.automationexercise.commons.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage extends BaseTest {
    @FindBy(xpath = "//*[contains(text(),'Signup')]")
    WebElement signupButton;


    public RegisterUserPage(){
        PageFactory.initElements(driver,this);
    }
    public void navigateToRegisterPage(){
       signupButton.click();

    }

}

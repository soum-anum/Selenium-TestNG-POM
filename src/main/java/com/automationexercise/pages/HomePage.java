package com.automationexercise.pages;

import com.automationexercise.commons.BaseTest;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public String validatePageTitle(){
       return driver.getTitle();
    }

}

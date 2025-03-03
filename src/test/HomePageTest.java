package test;

import com.automationexercise.commons.BaseTest;
import com.automationexercise.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest  extends BaseTest {

    HomePage homePage;
    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void  setUp(){
        initBrowser();
        homePage=new HomePage();
    }

    @Test
    public void homePageTest(){
        String title=homePage.validatePageTitle();
        Assert.assertEquals(title, "Automation Exercise");
        System.out.printf("Page Title is "+ title);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
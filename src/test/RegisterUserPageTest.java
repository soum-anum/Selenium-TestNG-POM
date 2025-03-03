package test;

import com.automationexercise.commons.BaseTest;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.RegisterUserPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserPageTest extends BaseTest {
   RegisterUserPage registerUserPage;
    public RegisterUserPageTest(){
        super();
    }

    @BeforeMethod
    public void  setUp(){
        initBrowser();
        registerUserPage=new RegisterUserPage();
    }

    @Test
    public void registerUserTest(){
        registerUserPage.navigateToRegisterPage();
    }

}

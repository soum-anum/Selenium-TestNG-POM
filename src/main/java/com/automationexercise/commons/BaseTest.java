package com.automationexercise.commons;

import com.automationexercise.util.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public static Properties properties;

    public BaseTest(){
        try{
            properties=new Properties();
            FileInputStream fileInputStream=new FileInputStream("src/config.properties");
            properties.load(fileInputStream);

        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void initBrowser(){
        String browserName=properties.getProperty("browser");
        System.out.print("Browser Name is "+browserName);
        if(browserName.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(properties.getProperty("url"));
    }
}

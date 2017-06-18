package com.selenium.test.testng.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert.*;


//import pages.RegForm;


/**
 * Created by Notik on 13.02.2017.
 */
public class simpletests {
static WebDriver driver = null;

@BeforeClass
public void beforeAllClass(){
driver = new ChromeDriver();}

@BeforeMethod
public void beforeEachMethod(){
    driver.get ("https://www.blablacar.com.ua/reyestratciya");
    driver.manage().deleteAllCookies();
    RegForm regForm = new RegForm(driver);
}


@AfterClass
    public void afterAllClass(){
    if (driver!=null){
        driver.quit();

    }
}


    @Test
    public void firstTest(){
      String name = "TestName";
      String lastName = "LastNAme";
      regForm.enterName(name, lastName);

      Assert.assertEquals(regForm.getName(),name);
      Assert.assertEquals(regForm.getLastName(),lastName);
    }
}

package com.selenium.test.testng.tests;

/**
 * Created by Notik on 18.06.2017.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegForm {
    private WebDriver  driver;

    @FindBy(css = ".form-action > button")
    private WebElement reg_button;

    @FindBy(id = "registration_newsletterFlag")
    private WebElement newletter;

    @FindBy(id = "registration_birthYear")
    private WebElement birthYear;

    @FindBy(id = "registration_password_second")
    private WebElement pass_second;

    @FindBy(id = "registration_password_first")
    private WebElement pass_first;

    @FindBy(id = "registration_email")
    private WebElement email;

    @FindBy(id = "registration_lastname")
    private WebElement lastname;

    @FindBy(id = "registration_firstname")
    private WebElement firstname;

    @FindBy(id = "registration_gender_1")
    private WebElement gender;


    @FindBy(css = "input[name='your-email']")
    private WebElement useremail;

    @FindBy(css = "input[name='text-297']")
    private WebElement phoneNumber;

    @FindBy(css = ".wpcf7-form")
    private WebElement element2;

    @FindBy(css = "input[name='your-name']")
    private WebElement userName;

    @FindBy(css = "input[name='text-68']")
    private WebElement userLastName;


    public RegForm(WebDriver webDriver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    private RegForm enterText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
        return this;

    }
    public RegForm enterUserName(String name){
        return enterText(userName,name)
    }

    public RegForm enterNameAndLastName(String name, String lastName){
        //return enterUserName(name).enterLastName(lastName);
    }

    public RegForm enterEmail(String email){
        return enterText(useremail, email)
    }

    public void submitForm(){
        //subminBtn.submit();
    }
    public String getName(){
        return userName.getAttribute("value");
    }
    public String getLastName(){
        return userLastName.getAttribute("value");
    }

}

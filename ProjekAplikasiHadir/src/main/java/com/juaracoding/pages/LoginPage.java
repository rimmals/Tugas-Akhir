package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement loginNotification;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-a97271']")
    private WebElement loginLogo;

    @FindBy(xpath = "//div[@class='MuiAlert-icon css-1l54tgj']//*[name()='svg']")
    private WebElement errorMessage;

    @FindBy(xpath = "//label[@name='password']")
    private WebElement errorNotification;


    public void setEmail(String email){
        this.email.sendKeys(email);
    }

    public String getAtributteEmail(){
        return email.getAttribute("type");
    }

    public void setPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public boolean isErrorMessage(){
        return errorMessage.isDisplayed();
    }

    public boolean isErrorNotification(){
        return errorNotification.isDisplayed();
    }

    public void setEmailPassword(String email, String password){
        setEmail(email);
        setPassword(password);
    }

    public void clearEmailPassword(){
        email.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
        password.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public void login(String email, String password){
        setEmail(email);
        setPassword(password);
        DriverSingleton.delay(2);
        submitButton.click();
    }

    public void getLoginNotification(){
        loginNotification.getText();
    }

    public boolean isLoginLogo(){
        return loginLogo.isDisplayed();
    }

}

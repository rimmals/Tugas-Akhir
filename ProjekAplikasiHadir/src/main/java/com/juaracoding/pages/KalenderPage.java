package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KalenderPage {

    WebDriver driver;

    public KalenderPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaKalender;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement tambahButton;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement infoPage;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement titikTiga;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[2]")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[3]")
    private WebElement deleteButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement yaButton;

    @FindBy(xpath = "//h6[normalize-space()='aaas']")
    private WebElement infoName;

    @FindBy(id = "name-helper-text")
    private WebElement errorMessage;

    public void clickTambahkanButton(){
        tambahkanButton.click();
    }

    public void inputNamaKalender(String nama){
        namaKalender.sendKeys(nama);
    }

    public void clickTambahButton(){
        tambahButton.click();
    }

    public String getInfoPage(){
        return infoPage.getText();
    }

    public void clickTitikTiga(){
        titikTiga.click();
    }

    public void clickEditButton(){
        editButton.click();
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }

    public void clickYaButton(){
        yaButton.click();
    }

    public String getInfoName(){
        return infoName.getText();
    }

    public boolean isErrorMessage(){
        return errorMessage.isDisplayed();
    }



}

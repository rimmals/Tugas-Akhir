package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImportStatusAktifPage {

    private WebDriver driver;

    public ImportStatusAktifPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='selfie']")
    private WebElement chooseFile;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement importButton;

    @FindBy(xpath = "//button[normalize-space()='Download Template']")
    private WebElement downloadTemplateButton;

    @FindBy(xpath = "//p[@id='selfie-helper-text']")
    private WebElement messageAlert;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement notifImport;

    public void inputFile(String namaFile){
        chooseFile.sendKeys(namaFile);
    }

    public String inputFileAtribute(){
        return chooseFile.getAttribute("type");
    }

    public void clickImportButton(){
        importButton.click();
    }

    public void clickDownloadTemplate(){
        downloadTemplateButton.click();
    }

    public void clickImport(){
        importButton.click();
    }

    public String getMessageAlert(){
        return messageAlert.getText();
    }

    public String getNotifImport(){
        return notifImport.getText();
    }

    public boolean isMessageAlert(){
        return messageAlert.isDisplayed();
    }

    public boolean isNotifImport(){
        return notifImport.isDisplayed();
    }

}



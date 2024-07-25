package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    private WebDriver driver;

    public DashboardPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Logo Hadir']")
    private WebElement hadirLogo;

    @FindBy(xpath = "//button[@aria-label='menu']//div[@class='MuiBox-root css-70qvj9']")
    private WebElement profileButton;

    @FindBy(xpath = "//button[normalize-space()='Logout']")
    private WebElement logoutButon;

    @FindBy(xpath = "//body/div[@id='__next']/div[@class='css-10f63sf']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiDrawer-root MuiDrawer-docked css-1tu59u4']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-elevation0 MuiDrawer-paper MuiDrawer-paperAnchorLeft MuiDrawer-paperAnchorDockedLeft css-1yw4omu']/div[@data-simplebar='init']/div[@class='simplebar-wrapper']/div[@class='simplebar-mask']/div[@class='simplebar-offset']/div[@aria-label='scrollable content']/div[@class='simplebar-content']/div[@class='MuiBox-root css-10klw3m']/div[@class='sidebar MuiBox-root css-ftf74w']/div[@class='MuiBox-root css-old1by']/div[2]/div[1]/div[1]/div[2]")
    private WebElement laporanMenu;

    @FindBy(xpath = "//p[normalize-space()='Izin Terlambat']")
    private WebElement izinTerlambatMenu;

    public void clickProfileButton(){
        profileButton.click();
    }

    public void clickLogoutButton(){
        logoutButon.click();
    }

    public void clickLaporanMenu(){
        laporanMenu.click();
    }

    public void clickIzinTerlambatMenu(){
        izinTerlambatMenu.click();
    }

    public void logout(){
        clickProfileButton();
        DriverSingleton.delay(2);
        clickLogoutButton();
    }

    public boolean isLogo(){
        return hadirLogo.isDisplayed();
    }

}

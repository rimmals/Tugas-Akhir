package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JadwalPage {

    WebDriver driver;

    public JadwalPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//button[@type='button'])[5]")
    private WebElement tambahkanButton;

    @FindBy(xpath = "//div[@id='typeJadwal']")
    private WebElement tipeJadwal;

    @FindBy(xpath = "//ul[@id='mui-38']/li")
    private WebElement opsiTipeJadwal;

    @FindBy(xpath = "//input[@id='mui-123']")
    private WebElement tanggalEfektif;

    @FindBy(xpath = "//input[@id='nameJadwal']")
    private WebElement namaJadwal;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaHariKerja;

    @FindBy(xpath = "(//button[@type='button'])[23]")
    private WebElement inputHariKerja1;

    @FindBy(xpath = "//div[@id='alert-dialog-slide-description']/div/div/div[2]/div")
    private WebElement inputHariKerja2;

    @FindBy(xpath = "//ul[@id='mui-68']/li[2]")
    private WebElement inputHariKerja3;

    @FindBy(xpath = "(//button[@type='button'])[26]")
    private WebElement inputHariKerja4;

    @FindBy(xpath = "//input[@id='t_keterlambatan']")
    private WebElement toleransiKeterlambatan;

    @FindBy(xpath = "((//button[@type='submit'])[2]")
    private WebElement tambahButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement titikTigaButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[2]")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[3]")
    private WebElement deleteButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement yaButton;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement infoPage;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/h6[1]")
    private WebElement infoName;

    @FindBy(xpath = "//div[@class='MuiSnackbarContent-message css-1w0ym84']")
    private WebElement notification;

    public void clickTambahkanButton(){
        tambahkanButton.click();
    }

    public void inputTipeJadwal(String tipe){
        tipeJadwal.sendKeys(tipe);
    }

    public void clickTipeJadwal(){
        tipeJadwal.click();
    }

    public void clickOpsiTipeJadwal(){
        opsiTipeJadwal.click();
    }

    public void inputTanggalEfekrif(String tanggal){
        tanggalEfektif.sendKeys(tanggal);
    }

    public void inputNamaJadwal(String jadwal){
        namaJadwal.sendKeys(jadwal);
    }

    public void inputNamaHariKerja(String hariKerja){
        inputHariKerja1.click();
        inputHariKerja2.click();
        inputHariKerja3.click();
        inputHariKerja4.click();
    }

    public void inputToleransiKeterlambatan(String toleransi){
        toleransiKeterlambatan.sendKeys(toleransi);
    }

    public void clickTambahButton(){
        tambahButton.click();
    }

    public void clickTitikTigaButton(){
        titikTigaButton.click();
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

    public String getInfoPage(){
        return infoPage.getText();
    }

    public String getInfoName(){
        return infoName.getText();
    }

    public boolean isNotifikasi(){
        return notification.isDisplayed();
    }

}

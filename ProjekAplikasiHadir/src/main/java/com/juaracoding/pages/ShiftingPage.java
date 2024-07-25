package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShiftingPage {

    WebDriver driver;

    public ShiftingPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement tambahkanButton;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    private WebElement titikTigaButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li[2]")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement namaJamKerja;

    @FindBy(xpath = "//input[@id='job_departement']")
    private WebElement namaUnit;

    @FindBy(xpath = "//input[@id='mui-51']")
    private WebElement jamMasuk;

    @FindBy(xpath = "//input[@id='mui-52']")
    private WebElement jamKeluar;

    @FindBy(xpath = "//input[@id='mui-55']")
    private WebElement jamMasukEdit;

    @FindBy(xpath = "//input[@id='mui-56']")
    private WebElement jamKeluarEdit;

    @FindBy(xpath = "//input[@id='code']")
    private WebElement codeShifting;

    @FindBy(xpath = "//input[@id='mui-53']")
    private WebElement breakStart;

    @FindBy(xpath = "//input[@id='mui-54']")
    private WebElement breakEnd;

    @FindBy(xpath = "//input[@id='mui-57']")
    private WebElement breakStartEdit;

    @FindBy(xpath = "//input[@id='mui-58']")
    private WebElement breakEndEdit;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement tambahButton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement yaButton;

    @FindBy(xpath = "//div[@id='__next']/div/div[2]/div/div/div/div/div/div[2]/div/table/tbody/tr/td/h6")
    private WebElement infoNama;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement infoPage;

    @FindBy(xpath = "//p[@id='name-helper-text']")
    private WebElement errorMessageName;

    @FindBy(xpath = "/p[@id='code-helper-text']")
    private WebElement errorMessageCodeShifting;

    @FindBy(xpath = "//li[@id='job_departement-option-0']")
    private WebElement opsiUnit;

    @FindBy(xpath = "//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation24 MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm MuiDialog-paperFullWidth css-cmgqgt']")
    private WebElement scrollTambah;

    public void inputSearchBox(String nama){
        searchBox.sendKeys(nama);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public void clickResetButton(){
        resetButton.click();
    }

    public void clickTambahkanButton(){
        tambahkanButton.click();
    }

    public void clickEditButton(){
        editButton.click();
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }

    public void clickTitikTigaButton(){
        titikTigaButton.click();
    }

    public void inputNamaJamKerja(String jamKerja){
        namaJamKerja.sendKeys(jamKerja);
    }

    public void inputNamaUnit(String nama){
        namaUnit.sendKeys(nama);
        opsiUnit.click();
    }

    public void inputJamMasuk(String jam){
        jamMasuk.sendKeys(jam);
    }

    public void inputJamKeluar(String jam){
        jamKeluar.sendKeys(jam);
    }

    public void inputJamMasukEdit(String jam){
        jamMasukEdit.sendKeys(jam);
    }

    public void inputJamKeluarEdit(String jam){
        jamKeluarEdit.sendKeys(jam);
    }

    public void inputCodeShifting(String shifting){
        codeShifting.sendKeys(shifting);
    }

    public void inputBreakStart(String startBreak){
        breakStart.sendKeys(startBreak);
    }

    public void inputBreakEnd(String endBreak){
        breakEnd.sendKeys(endBreak);
    }

    public void inputBreakStartEdit(String startBreak){
        breakStartEdit.sendKeys(startBreak);
    }

    public void inputBreakEndEdit(String endBreak){
        breakEndEdit.sendKeys(endBreak);
    }

    public void clickTambahButton(){
        tambahButton.click();
    }

    public void clickYaButton(){
        yaButton.click();
    }

    public String getInfoNama(){
        return infoNama.getText();
    }

    public String getInfoPage(){
        return infoPage.getText();
    }

    public void deleteNama(){
        namaUnit.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }

    public void enterSearch(){
        namaJamKerja.sendKeys(Keys.ENTER);
    }

    public boolean isErrorMessageName(){
        return errorMessageName.isDisplayed();
    }

    public boolean isErrorMessageCodeShifting(){
        return errorMessageCodeShifting.isDisplayed();
    }

    public void doubleClickScroll(){
        scrollTambah.click();
        DriverSingleton.delay(1);
        scrollTambah.click();
    }








}

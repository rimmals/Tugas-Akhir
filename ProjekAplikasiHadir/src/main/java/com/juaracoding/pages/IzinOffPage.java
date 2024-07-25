package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IzinOffPage {


    private WebDriver driver;

    public IzinOffPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchColumn;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement resetButton;

    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-7 MuiGrid-grid-lg-8 css-kw2xn2']//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement ikonStartDate;

    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
    private WebElement filterButton;

    @FindBy(xpath = "//tbody/tr[1]/td[2]/h6[1]")
    private WebElement infoNamaUser;

    @FindBy(xpath = "//tbody/tr[1]/td[4]/h6[1]")
    private WebElement infoTanggalIzinOff;

    @FindBy(xpath = "//input[@placeholder='Early']")
    private WebElement startDateColumn;

    @FindBy(xpath = "//input[@placeholder='Continuous']")
    private WebElement endDateColumn;

    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement saveButton;

    @FindBy(id = "job_departement")
    private WebElement filterColumn;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement terapkanButton;

    @FindBy(xpath = "//div[@id='mui-4']")
    private WebElement rowsPerPage;

    @FindBy(xpath = "//li[normalize-space()='5']")
    private WebElement rowsPerPage5;

    @FindBy(xpath = "//li[normalize-space()='10']")
    private WebElement rowsPerPage10;

    @FindBy(xpath = "//li[normalize-space()='25']")
    private WebElement rowsPerPage25;

    @FindBy(xpath = "//button[@title='Go to next page']")
    private WebElement goToNextPageButton;

    @FindBy(xpath = "//button[@title='Go to last page']")
    private WebElement goToLastPageButton;

    @FindBy(xpath = "//button[@title='Go to previous page']")
    private WebElement goToPreviousPageButton;

    @FindBy(xpath = "//button[@title='Go to first page']")
    private WebElement goToFirstPageButton;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement informationPage;


    public void inputSearchColumn(String name) {
        searchColumn.sendKeys(name);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickResetButton() {
        resetButton.click();
    }

    public void clickIkonStartDate() {
        ikonStartDate.click();
    }

    public void clickFilterButton() {
        filterButton.click();
    }

    public String getInfoNamaUser() {
        return infoNamaUser.getText();
    }

    public String getInfoTanggalIzinOff() {
        return infoTanggalIzinOff.getText();
    }

    public void inputStartDateColumn(String startDate) {
        startDateColumn.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        DriverSingleton.delay(2);
        startDateColumn.sendKeys(startDate);
    }

    public void inputEndDateColumn(String endDate) {
        endDateColumn.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
        DriverSingleton.delay(2);
        endDateColumn.sendKeys(endDate);
    }

    public void inputFilterColumn(String filter) {
        filterColumn.sendKeys(filter);
        filterColumn.sendKeys(Keys.ENTER);
    }

    public void clickTerapkanButton(){
        terapkanButton.click();
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void clickRowsPerPage(){
        rowsPerPage.click();
    }

    public void clickRowsPerPage5(){
        rowsPerPage5.click();
    }

    public void clickRowsPerPage10(){
        rowsPerPage10.click();
    }

    public void clickRowsPerPage25(){
        rowsPerPage25.click();
    }

    public void clickGoToNextPageButton(){
        goToNextPageButton.click();
    }

    public void clickGoToLastPageButton(){
        goToLastPageButton.click();
    }

    public void clickGoToPreviousPageButton(){
        goToPreviousPageButton.click();
    }

    public void clickGoToFirstPageButton(){
        goToFirstPageButton.click();
    }

    public String getInformationPage(){
        return informationPage.getText();
    }


}

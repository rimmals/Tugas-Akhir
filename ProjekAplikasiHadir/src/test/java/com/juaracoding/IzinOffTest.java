package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.IzinOffPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;
import java.net.URL;
import java.sql.Driver;

public class IzinOffTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static IzinOffPage izinOffPage = new IzinOffPage();


    public IzinOffTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Login dan buka halaman izin off")
    public void login_dan_buka_halaman_izin_off(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        loginPage.login("admin@hadir.com", "admin@hadir");
        DriverSingleton.delay(5);
        driver.get(Constant.izinOffURL);
        DriverSingleton.delay(3);
    }

    @Given("Buka halaman izin off")
    public void buka_halaman_izin_off(){
        driver.get(Constant.izinOffURL);
        driver.manage().window().maximize();
        DriverSingleton.delay(2);
    }

    @When("Input nama pada kolom search")
    public void input_nama_pada_kolom_search(){
        izinOffPage.inputSearchColumn("User Rima");
    }

    @When("Klik ikon filter")
    public void klik_ikon_filter(){
        DriverSingleton.delay(2);
        izinOffPage.clickFilterButton();
    }

    @When("Klik ikon start date")
    public void klik_ikon_start_date(){
        izinOffPage.clickIkonStartDate();
    }

    @When("Klik tombol go to next page")
    public void klik_tombol_go_to_next_page(){
        izinOffPage.clickGoToNextPageButton();
    }

    @When("Klik tombol go to previous page")
    public void klik_tombol_go_to_previous_page(){
        DriverSingleton.delay(2);
        izinOffPage.clickGoToPreviousPageButton();
    }

    @When("Klik tombol go to last page")
    public void klik_tombol_go_to_last_page(){
        DriverSingleton.delay(2);
        izinOffPage.clickGoToLastPageButton();
    }

    @When("Klik tombol go to first page")
    public void klik_tombol_go_to_first_page(){
        DriverSingleton.delay(2);
        izinOffPage.clickGoToFirstPageButton();
    }

    @When("Klik opsi page")
    public void klik_opsi_page(){
        DriverSingleton.delay(2);
        izinOffPage.clickRowsPerPage();
    }

    @And("Klik tombol search")
    public void klik_tombol_search(){
        DriverSingleton.delay(3);
        izinOffPage.clickSearchButton();
    }

    @And("Klik tombol search date")
    public void klik_tombol_search_date(){
        DriverSingleton.delay(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -300)");
        izinOffPage.clickSearchButton();
    }

    @And("Klik tombol reset")
    public void klik_tombol_reset(){
        izinOffPage.clickResetButton();
    }

    @And("Input nama unit di field unit")
    public void input_nama_unit_di_field_unit(){
        izinOffPage.inputFilterColumn("AMEX MERCHANT");
    }

    @And("Klik tombol terapkan")
    public void klik_tombol_terapkan(){
        izinOffPage.clickTerapkanButton();
    }

    @And("Masukkan start date dan end date")
    public void masukkan_start_date_dan_end_date(){
        izinOffPage.inputStartDateColumn("Jul 20, 2024");
        DriverSingleton.delay(1);
        izinOffPage.inputEndDateColumn("Jul 20, 2024");
    }

    @And("Klik tombol save")
    public void klik_tombol_save(){
        izinOffPage.clickSaveButton();
        DriverSingleton.delay(2);
    }

    @And("Pilih opsi page 5")
    public void pilih_opsi_page_5(){
        izinOffPage.clickRowsPerPage5();
    }

    @And("Pilih opsi page 10")
    public void pilih_opsi_page_10(){
        izinOffPage.clickRowsPerPage10();
    }

    @And("Pilih opsi page 25")
    public void pilih_opsi_page_25(){
        izinOffPage.clickRowsPerPage25();
    }

    @Then("Menampilkan data nama yang dicari")
    public void menampilkan_data_nama_yang_dicari(){
        DriverSingleton.delay(2);
        Assert.assertEquals(izinOffPage.getInfoNamaUser(), "User Rima");
    }

    @Then("Menampilkan data izin off default")
    public void menampilkan_data_izin_off_default(){
        DriverSingleton.delay(2);
        System.out.println(izinOffPage.getInformationPage());
    }

    @Then("Data izin off ditampilkan sesuai dengan unit yang diimputkan")
    public void data_izin_off_ditampilkan_sesuai_dengan_unit_yang_diimputkan(){
        DriverSingleton.delay(2);
    }

    @Then("Menampilkan data sesuai start date dan end date")
    public void menampilkan_data_sesuai_start_date_dan_end_date(){
        Assert.assertEquals(izinOffPage.getInfoTanggalIzinOff(), "13 Agt 2024");
    }

    @Then("Menampilkan 5 data per page")
    public void menampilkan_5_data_per_page(){
        Assert.assertEquals(izinOffPage.getInformationPage(), "1-5 of 53");
    }

    @Then("Menampilkan 10 data per page")
    public void menampilkan_10_data_per_page(){
        Assert.assertEquals(izinOffPage.getInformationPage(), "1-10 of 53");
    }

    @Then("Menampilkan 25 data per page")
    public void menampilkan_25_data_per_page(){
        Assert.assertEquals(izinOffPage.getInformationPage(), "1-25 of 53");
    }

    @Then("Menampilkan data next page")
    public void menampilkan_data_next_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(izinOffPage.getInformationPage(), "11-20 of 53");
    }

    @Then("Menampilkan data previous page")
    public void menampilkan_data_previous_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(izinOffPage.getInformationPage(), "1-10 of 53");
    }

    @Then("Menampilkan data last page")
    public void menampilkan_data_last_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(izinOffPage.getInformationPage(), "51-53 of 53");
    }

    @Then("Menampilkan data first page")
    public void menampilkan_data_first_page(){
        DriverSingleton.delay(2);
        Assert.assertEquals(izinOffPage.getInformationPage(), "1-10 of 53");
    }


}

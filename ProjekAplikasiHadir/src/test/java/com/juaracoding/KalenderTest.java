package com.juaracoding;

import com.juaracoding.pages.JadwalPage;
import com.juaracoding.pages.KalenderPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class KalenderTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static KalenderPage kalenderPage = new KalenderPage();

    public KalenderTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Buka halaman kalender")
    public void buka_halaman_kalender(){
        driver.get(Constant.kalenderUrl);
        driver.manage().window().maximize();
    }

    @When("Klik tombol tambahkan kalender")
    public void klik_tombol_tambahkan_kalender(){
        kalenderPage.clickTambahkanButton();
    }

    @When("Klik tombol titik tiga kalender")
    public void klik_tombol_titik_tiga_kalender(){
        kalenderPage.clickTitikTiga();
    }

    @And("Input nama kalender")
    public void input_nama_kalender(){
        kalenderPage.inputNamaKalender("aaates");
    }

    @And("Klik tombol tambah")
    public void klik_tombol_tambah(){
        kalenderPage.clickTambahButton();
    }

    @And("Klik tombol edit kalender")
    public void klik_tombol_edit_kalender(){
        kalenderPage.clickEditButton();
    }

    @And("Input edit kalender")
    public void input_edit_kalender(){
        kalenderPage.inputNamaKalender("aaas");
    }

    @And("Klik tombol delete kalender")
    public void klik_tombol_delete_kalender(){
        kalenderPage.clickDeleteButton();
    }
    @And("Klik tombol ya kalender")
    public void klik_tombol_ya_kalender(){
        kalenderPage.clickYaButton();
    }

    @Then("Kalender berhasil ditambahkan")
    public void kalender_berhasil_ditambahkan(){

    }

    @Then("Pesan nama kalender wajib diisi muncul")
    public void pesan_nama_kalender_wajib_diisi_muncul(){

    }

    @Then("Berhasil mengedit kalender")
    public void berhasil_mengedit_kalender(){

    }

    @Then("Kalender berhasil dihapus")
    public void kalender_berhasil_dihapus(){

    }



}

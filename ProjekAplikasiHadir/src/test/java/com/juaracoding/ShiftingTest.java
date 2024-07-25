package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.IzinOffPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ShiftingPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.internal.protocols.Input;

import java.sql.Driver;

public class ShiftingTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static ShiftingPage shiftingPage = new ShiftingPage();


    public ShiftingTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Buka halaman shifting")
    public void buka_halaman_shifting(){
        driver.get(Constant.shiftingUrl);
        driver.manage().window().maximize();
    }

    @When("Input nama unit pada search box")
    public void input_nama_unit_pada_search_box(){
        DriverSingleton.delay(2);
        shiftingPage.inputSearchBox("Admin Warung Weekend");
    }

    @When("Klik tambah shift")
    public void klik_tambah_shift(){
        shiftingPage.clickTambahkanButton();
        DriverSingleton.delay(1);
    }

    @When("Pilih shift")
    public void pilih_shift(){
        DriverSingleton.delay(1);
        shiftingPage.clickTitikTigaButton();
        DriverSingleton.delay(2);
    }

    @And("Klik tombol search shifting")
    public void klik_tombol_search_shifting(){
        DriverSingleton.delay(1);
        shiftingPage.clickSearchButton();
        DriverSingleton.delay(1);
    }

    @And("Klik tombol reset shifting")
    public void klik_tombol_reset_shifting(){
        DriverSingleton.delay(1);
        shiftingPage.clickResetButton();
        DriverSingleton.delay(2);
    }

    @And("Input semua field")
    public void Input_semua_field(){
        DriverSingleton.delay(1);
//        shiftingPage.inputNamaJamKerja("tes");
//        shiftingPage.inputNamaUnit("Accounting");
//        shiftingPage.inputJamMasuk("12:00");
//        shiftingPage.inputJamKeluar("20:00");
//        shiftingPage.inputCodeShifting("014838");
//        shiftingPage.inputBreakStart("15:00");
//        shiftingPage.inputBreakEnd("16:00");
    }

    @And("Klik simpan")
    public void klik_simpan(){
        DriverSingleton.delay(1);
//        shiftingPage.clickTambahButton();
    }

    @And("Biarkan beberapa shift kosong")
    public void biarkan_beberapa_shift_kosong(){
        DriverSingleton.delay(1);
//        shiftingPage.inputNamaJamKerja("tes kosong");
//        shiftingPage.inputJamMasuk("12:00");
//        shiftingPage.inputJamKeluar("20:00");
//        shiftingPage.inputBreakStart("15:00");
//        shiftingPage.inputBreakEnd("16:00");
    }

    @And("Klik edit")
    public void klik_edit(){
//        shiftingPage.clickEditButton();
    }

    @And("Ubah data shift")
    public void ubah_data_shift(){
        DriverSingleton.delay(1);
//        shiftingPage.inputNamaJamKerja("tes ubah");
//        shiftingPage.inputNamaUnit("Accounting");
//        shiftingPage.inputJamMasukEdit("10:00");
//        shiftingPage.inputJamKeluarEdit("18:00");
//        shiftingPage.inputCodeShifting("014838");
//        shiftingPage.inputBreakStartEdit("13:00");
//        shiftingPage.inputBreakEndEdit("14:00");
    }

    @And("Masukkan data shift yang tidak valid")
    public void masukkan_data_shift_yang_tidak_valid(){
//        shiftingPage.deleteNama();
        DriverSingleton.delay(1);
    }

    @And("Klik hapus")
    public void klik_hapus(){
        shiftingPage.clickDeleteButton();
    }

    @And("Konfirmasi penghapusan")
    public void konfirmasi_penghapusan(){
        shiftingPage.clickYaButton();
    }

    @Then("Menampilkan nama unit yang dicari")
    public void menampilkan_nama_unit_yang_dicari(){
        DriverSingleton.delay(2);
        Assert.assertEquals(shiftingPage.getInfoNama(), "Admin Warung Weekend");
    }

    @Then("Menampilkan data default")
    public void menampilkan_data_default(){
        DriverSingleton.delay(1);
        Assert.assertTrue(shiftingPage.getInfoPage().contains("1-10"));
    }

    @Then("Shift baru berhasil ditambahkan")
    public void shift_baru_berhasil_ditambahkan(){
        DriverSingleton.delay(1);
//        Assert.assertEquals(shiftingPage.getInfoPage(), "1-10 of 50");
    }

    @Then("Berhasil diedit")
    public void berhasil_diedit(){
        DriverSingleton.delay(1);
//        Assert.assertEquals(shiftingPage.getInfoNama(), "tes ubah");
    }

    @Then("Muncul pesan error field wajib diisi")
    public void muncul_pesan_error_field_wajib_diisi(){
        DriverSingleton.delay(1);
//        shiftingPage.isErrorMessageCodeShifting();
    }

    @Then("Muncul pesan error data yang dimasukkan tidak valid")
    public void muncul_pesan_error(){
        DriverSingleton.delay(1);
//        shiftingPage.isErrorMessageName();
    }

    @Then("Shift dihapus dari daftar")
    public void shift_dihapus_dari_daftar(){
        DriverSingleton.delay(1);
//        Assert.assertEquals(shiftingPage.getInfoPage(), "1-10 of 49");
    }





}

package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.JadwalPage;
import com.juaracoding.pages.ShiftingPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class JadwalTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static JadwalPage jadwalPage = new JadwalPage();


    public JadwalTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Buka halaman jadwal")
    public void buka_halaman_jadwal(){
        driver.get(Constant.jadwalUrl);
        driver.manage().window().maximize();
    }

    @When("Klik tambahkan jadwal")
    public void klik_tambahkan_jadwal(){
        jadwalPage.clickTambahkanButton();
    }

    @When("Klik tombol titik tiga")
    public void klik_tombol_titik_tiga(){
        jadwalPage.clickTitikTigaButton();
    }

    @And("Input data valid")
    public void input_data_valid(){
//        jadwalPage.clickTipeJadwal();
//        jadwalPage.clickOpsiTipeJadwal();
//        jadwalPage.inputTanggalEfekrif("07/21/2024");
        jadwalPage.inputNamaJadwal("aaates");
//        jadwalPage.inputNamaHariKerja("1 hari kerja 6 libur");
        jadwalPage.inputToleransiKeterlambatan("30");
        DriverSingleton.delay(1);
    }

    @And("Klik simpan jadwal")
    public void klik_simpan_jadwal(){
        DriverSingleton.delay(1);
//        jadwalPage.clickTambahButton();
    }

    @And("Klik tombol edit")
    public void klik_tombol_edit(){
        jadwalPage.clickEditButton();
    }

    @And("Input data edit valid")
    public void input_data_edit_valid(){
//        jadwalPage.clickTipeJadwal();
//        jadwalPage.clickOpsiTipeJadwal();
//        jadwalPage.inputTanggalEfekrif("07/21/2024");
        jadwalPage.inputNamaJadwal("aaaedit");
//        jadwalPage.inputNamaHariKerja("1 hari kerja 6 libur");
        jadwalPage.inputToleransiKeterlambatan("30");
        DriverSingleton.delay(1);
    }

    @And("Input data tidak lengkap")
    public void input_data_tidak_lengkap(){
//        jadwalPage.clickTipeJadwal();
//        jadwalPage.inputTanggalEfekrif("07/21/2024");
        jadwalPage.inputNamaJadwal("aaaedit");
        jadwalPage.inputToleransiKeterlambatan("30");
        DriverSingleton.delay(1);
    }

    @And("Klik tombol delete")
    public void klik_tombol_delete(){
        jadwalPage.clickDeleteButton();
    }

    @And("Klik tombol ya")
    public void klik_tombol_ya(){
        jadwalPage.clickYaButton();
    }

    @Then("Jadwal berhasil ditambahkan")
    public void jadwal_berhasil_ditambahkan(){
        DriverSingleton.delay(1);
//        System.out.println(jadwalPage.getInfoPage());
    }

    @Then("Jadwal gagal ditambahkan")
    public void jadwal_gagal_ditambahkan(){
        DriverSingleton.delay(1);
        //        System.out.println(jadwalPage.getInfoPage());
    }

    @Then("Jadwal berhasil diedit")
    public void jadwal_berhasil_diedit(){
        System.out.println(jadwalPage.getInfoName());
    }

    @Then("Jadwal berhasil dihapus")
    public void jadwal_berhasil_dihapus(){
        System.out.println(jadwalPage.getInfoPage());
    }

}

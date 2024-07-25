package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.ImportStatusAktifPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ImportStatusAktifTest {

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static ImportStatusAktifPage importStatusAktifPage = new ImportStatusAktifPage();

    public ImportStatusAktifTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Buka halaman import status aktif")
    public void buka_halaman_import_status_aktif(){
        driver.get(Constant.importStatusAktifURL);
        driver.manage().window().maximize();
    }

    @When("Pilih file xlsx dari komputer")
    public void pilih_file_xlsx_dari_komputer(){
        importStatusAktifPage.inputFile("D:\\agooo\\File Template\\DATA_STATUS_USER .xlsx");
    }

    @When("Pilih file selain xlsx dari komputer")
    public void pilih_file_selain_xlsx_dari_komputer(){
        importStatusAktifPage.inputFile("D:\\agooo\\File Template\\MOM Re-UAT CR AGO AKUNTANSI&DASHBOARD 30_05_2024.docx");
    }

    @When("Pilih file tidak sesuai template dari komputer")
    public void pilih_file_tidak_sesuai_template_dari_komputer(){
        importStatusAktifPage.inputFile("D:\\agooo\\File Template\\AsetManajemen.xls");
    }

    @When("Klik tombol download template")
    public void klik_tombol_download_template(){
        importStatusAktifPage.clickDownloadTemplate();
    }

    @And("Klik tombol impor")
    public void klik_tombol_impor(){
        importStatusAktifPage.clickImport();
    }

    @Then("File berhasil diimpor")
    public void file_berhasil_diimpor(){
        DriverSingleton.delay(1);
        importStatusAktifPage.isNotifImport();
        Assert.assertEquals(importStatusAktifPage.getNotifImport(), "Berhasil import excel");
    }

    @Then("Muncul pesan pemberitahuan file salah")
    public void muncul_pesan_pemberitahuan_file_salah(){
        DriverSingleton.delay(1);
        importStatusAktifPage.isMessageAlert();
    }

    @Then("File template berhasil di download")
    public void file_template_berhasil_di_download(){
        DriverSingleton.delay(1);
        //TODO: file berhasil di download
    }

    @Then("File gagal diimpor")
    public void file_gagal_diimpor(){
        DriverSingleton.delay(2);
        importStatusAktifPage.isNotifImport();
        Assert.assertEquals(importStatusAktifPage.getNotifImport(), "*File harus berupa file Excel (.xls atau .xlsx)");
    }

    @Then("File tidak sesuai gagal diimpor")
    public void file_tidak_sesuai_gagal_diimpor(){
        DriverSingleton.delay(2);
        importStatusAktifPage.isNotifImport();
        Assert.assertTrue(importStatusAktifPage.getNotifImport().contains("harus sesuai template"));
    }

    @Then("Notifikasi wajib input file muncul")
    public void notifikasi_wajib_input_file_muncul(){
        DriverSingleton.delay(1);
        Assert.assertEquals(importStatusAktifPage.inputFileAtribute(), "file");
    }

}

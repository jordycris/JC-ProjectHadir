package com.juaracoding;

import com.juaracoding.pages.LoginAdminPage;
import com.juaracoding.pages.RegistUserPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistUserTest {
    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static RegistUserPage registUserPage = new RegistUserPage();

    public RegistUserTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User mengakses website absensi")
    public void user_mengakses_website_absensi() {
        driver.get("https://staging-hadir.ptkta.com/absen/login");
        extentTest.log(LogStatus.PASS, "User mengakses halaman login");
    }

    @When("User klik daftar akun disini")
    public void user_klik_daftar_akun_disini() {
        registUserPage.clickBtnDisini();
        extentTest.log(LogStatus.PASS, "User klik daftar akun disini");
    }

    @When("User masukan NIK")
    public void user_masukan_nik() {
        registUserPage.inputNIK("D6220627");
        extentTest.log(LogStatus.PASS, "User masukan NIK");
    }

    @And("User masukan nama lengkap")
    public void user_masukan_nama_lengkap() {
        registUserPage.inputNamaLengkap("rahmania");
        extentTest.log(LogStatus.PASS, "User masukan nama lengkap");
    }

    @And("User masukan email yang akan digunakan")
    public void user_masukan_email_yang_akan_digunakan() {
        registUserPage.inputUserEmail("rahma@gimel.com");
        extentTest.log(LogStatus.PASS, "User masukan email yang akan digunakan");
    }

    @And("User masukan password yang akan digunakan")
    public void user_masukan_password_yang_akan_digunakan() {
        registUserPage.inputUserPassword("rahma");
        extentTest.log(LogStatus.PASS, "User masukan password yang akan digunakan");
    }

    @And("User upload selfie")
    public void user_upload_selfie() {
        registUserPage.setUploadSelfie("C:\\Users\\ASUS\\Downloads\\bg.png");
        extentTest.log(LogStatus.PASS, "User upload selfie");
    }

    @And("User klik daftar")
    public void user_klik_daftar() {
        registUserPage.clickBtnDaftar();
        extentTest.log(LogStatus.PASS, "User klik daftar");
    }

    @Then("User berhasil regist dan menunggu approve admin")
    public void user_berhasil_regist_dan_menunggu_approve_admin() {
        Assert.assertEquals(registUserPage.getTextSuksesRegist(), "Sudah punya akun ? masuk");
        extentTest.log(LogStatus.PASS, "Berhasil register");
    }

    @Given("User berada di website absensi")
    public void user_berada_di_website_absensi() {
        driver.get("https://staging-hadir.ptkta.com/absen/login");
        extentTest.log(LogStatus.PASS, "User berada di website absensi");
    }

    @When("User klik daftar disini")
    public void user_klik_daftar_disini() {
        registUserPage.clickBtnDisini();
        extentTest.log(LogStatus.PASS, "User klik daftar disini");
    }

    @And("User klik button daftar")
    public void user_klik_button_daftar() {
        registUserPage.clickBtnDaftar();
        extentTest.log(LogStatus.PASS, "User klik button daftar");
    }

    @Then("User gagal membuat akun")
    public void user_gagal_membuat_akun() {
        Assert.assertEquals(registUserPage.getTextSuksesRegist(), "Sudah punya akun ? masuk");
        extentTest.log(LogStatus.PASS, "Gagal buat akun");
    }
}

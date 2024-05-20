package com.juaracoding;

import com.juaracoding.pages.LoginAdminPage;

import com.juaracoding.pages.RegistUserPage2;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RegistUserTest2 {
    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static RegistUserPage2 registUserPage2 = new RegistUserPage2();

    public RegistUserTest2() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User2 mengakses website absensi")
    public void user2_mengakses_website_absensi() {
        driver.get("https://staging-hadir.ptkta.com/absen/login");
        extentTest.log(LogStatus.PASS, "User2 mengakses halaman login");
    }

    @When("User2 klik daftar akun disini")
    public void user2_klik_daftar_akun_disini() {
        registUserPage2.clickBtnDisini();
        extentTest.log(LogStatus.PASS, "User2 klik daftar akun disini");
    }

    @When("User2 masukan NIK")
    public void user2_masukan_nik() {
        registUserPage2.inputNIK("D6220627");
        extentTest.log(LogStatus.PASS, "User2 masukan NIK");
    }

    @And("User2 masukan nama lengkap")
    public void user2_masukan_nama_lengkap() {
        registUserPage2.inputNamaLengkap("baskwoa");
        extentTest.log(LogStatus.PASS, "User2 masukan nama lengkap");
    }

    @And("User2 masukan email yang akan digunakan")
    public void user2_masukan_email_yang_akan_digunakan() {
        registUserPage2.inputUserEmail("baskorowa@gimel.com");
        extentTest.log(LogStatus.PASS, "User2 masukan email yang akan digunakan");
    }

    @And("User2 masukan password yang akan digunakan")
    public void user2_masukan_password_yang_akan_digunakan() {
        registUserPage2.inputUserPassword("bask1wo");
        extentTest.log(LogStatus.PASS, "User2 masukan password yang akan digunakan");
    }

    @And("User2 upload selfie")
    public void user2_upload_selfie() {
        registUserPage2.setUploadSelfie("C:\\Users\\ASUS\\Downloads\\bg.png");
        extentTest.log(LogStatus.PASS, "User2 upload selfie");
    }

    @And("User2 klik daftar")
    public void user2_klik_daftar() {
        registUserPage2.clickBtnDaftar();
        extentTest.log(LogStatus.PASS, "User2 klik daftar");
    }

    @Then("User2 berhasil regist dan menunggu approve admin")
    public void user2_berhasil_regist_dan_menunggu_approve_admin() {
        Assert.assertEquals(registUserPage2.getTextSuksesRegist(), "Sudah punya akun ? masuk");
        extentTest.log(LogStatus.PASS, "Berhasil register");
    }

    @Given("User2 berada di website absensi")
    public void user2_berada_di_website_absensi() {
        driver.get("https://staging-hadir.ptkta.com/absen/login");
        extentTest.log(LogStatus.PASS, "User2 berada di website absensi");
    }

    @When("User2 klik daftar disini")
    public void user2_klik_daftar_disini() {
        registUserPage2.clickBtnDisini();
        extentTest.log(LogStatus.PASS, "User2 klik daftar disini");
    }

    @And("User2 klik button daftar")
    public void user2_klik_button_daftar() {
        registUserPage2.clickBtnDaftar();
        extentTest.log(LogStatus.PASS, "User2 klik button daftar");
    }

    @Then("User2 gagal membuat akun")
    public void user2_gagal_membuat_akun() {
        Assert.assertEquals(registUserPage2.getTextSuksesRegist(), "Sudah punya akun ? masuk");
        extentTest.log(LogStatus.PASS, "Gagal buat akun");
    }
}

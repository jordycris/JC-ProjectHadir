package com.juaracoding;

import com.juaracoding.pages.LoginAdminPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginAdminTest {

    private static WebDriver driver;
    public static ExtentTest extentTest;
    private static LoginAdminPage loginPage = new LoginAdminPage();

    public LoginAdminTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin mengakses halaman login")
    public void admin_mengakses_halaman_login() {
        driver.get("https://staging-hadir.ptkta.com/authentication/login");
        extentTest.log(LogStatus.PASS, "User mengakses halaman login");
    }

    @When("Admin masukan alamat email valid")
    public void admin_masukan_alamat_email_valid() {
        loginPage.inputEmail("admin@hadir.com");
        extentTest.log(LogStatus.PASS, "Admin masukan alamat email valid");
    }
    @And("Admin input password valid")
    public void admin_input_password_valid() {
        loginPage.inputPassword("admin@hadir");
        extentTest.log(LogStatus.PASS, "Admin input password valid");
    }
    @And("Admin klik tombol login")
    public void admin_klik_tombol_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "Admin klik tombol login");
    }
    @Then("Admin berhasil login dan diarahkan ke halaman dashboard")
    public void admin_berhasil_login_dan_diarahkan_ke_halaman_dashboard() {
        Boolean isValid=loginPage.getTxtDashboard().contains("Hadir");
        Assert.assertTrue(isValid);
        extentTest.log(LogStatus.PASS, "Admin berhasil login dan diarahkan ke halaman dashboard");
    }
    @Given("Admin berada di halaman login")
    public void admin_berada_di_halaman_login() {
        loginPage.logout();
        extentTest.log(LogStatus.PASS, "Admin berada di halaman login");
    }
    @When("Admin memasukan email yang salah")
    public void admin_memasukan_email_yang_salah() {
        loginPage.inputEmail("Admin@hadirr.com");
        extentTest.log(LogStatus.PASS, "Admin memasukan email yang salah");
    }
    @And("Admin memasukan password yang salah")
    public void admin_memasukan_password_yang_salah() {
        loginPage.inputPassword("admin1234");
        extentTest.log(LogStatus.PASS, "Admin memasukan password yang salah");
    }
    @Then("Sistem menampilkan pesan akun tidak ditemukan")
    public void sistem_menampilkan_pesan_akun_tidak_ditemukan() {
        Assert.assertEquals(loginPage.getTxtAkunTidakDitemukan(), "Akun tidak ditemukan");
        extentTest.log(LogStatus.PASS, "Sistem menampilkan pesan akun tidak Ditemukan");
    }



}
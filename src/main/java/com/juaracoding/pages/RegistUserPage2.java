package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegistUserPage2 {

    private WebDriver driver;

    public RegistUserPage2() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator Find Element menggunakan PageFactory
    @FindBy(xpath = "//button[normalize-space()='disini']")
    private WebElement btnDisini;

    @FindBy(xpath = "//input[@id='nik']")
    private WebElement nik;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement namaLengkap;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userEmail;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement userPassword;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement uploadSelfie;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnDaftar;
    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza']")
    private WebElement txtSuksesRegist;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1ub5lza']")
    private WebElement txtGagalRegist;

    public void setB(String nik, String namaLengkap, String userEmail, String userPassword) {
        btnDisini.click();
        this.nik.sendKeys(nik);
        this.namaLengkap.sendKeys(namaLengkap);
        this.userEmail.sendKeys(userEmail);
        this.userPassword.sendKeys(userPassword);
        this.uploadSelfie.sendKeys("C:\\Users\\ASUS\\Downloads\\bg.png");
        btnDaftar.click();
    }

    public void clickBtnDisini() {
        btnDisini.click();
    }

    public void inputNIK(String nik) {
        this.nik.sendKeys(nik);
    }

    public void inputNamaLengkap(String namaLengkap) {
        this.namaLengkap.sendKeys(namaLengkap);
    }

    public void inputUserEmail(String userEmail) {
        this.userEmail.sendKeys(userEmail);
    }

    public void inputUserPassword(String userPassword) {
        this.userPassword.sendKeys(userPassword);
    }

    public void setUploadSelfie(String uploadSelfie) {
        this.uploadSelfie.sendKeys("C:\\Users\\ASUS\\Downloads\\bg.png");
    }

    public void clickBtnDaftar() {
        btnDaftar.click();
    }

    // return getText
    public String getTextSuksesRegist() {
        return txtSuksesRegist.getText();
    }

    public String getTxtAkunTidakDitemukan() {
        try {
            Thread.sleep(3000);
            return txtGagalRegist.getText();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

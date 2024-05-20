package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAdminPage {
    private WebDriver driver;

    public LoginAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    @FindBy(xpath = "//p[normalize-space()='© 2022 Aplikasi Hadir']")
    private WebElement txtDashboard;

    @FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-5shv7u']")
    private WebElement userClickAdmin;

    @FindBy(xpath = "//*[@id=\"profile-menu\"]/div[3]/ul/div/button[2]")
    private WebElement btnLogout;

    @FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1qamc72']")
    private WebElement txtAkunTidakDitemukan;

    public void setB(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        btnLogin.click();
    }
    public void inputEmail(String email){
        this.email.sendKeys(email);
    }
    public void inputPassword(String password){
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    // return getText
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }

    public void logout(){
        try {
            Thread.sleep(3000);
            userClickAdmin.click();
            Thread.sleep(3000);
            btnLogout.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public String getTxtAkunTidakDitemukan(){
        try {
            Thread.sleep(3000);
            return txtAkunTidakDitemukan.getText();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}


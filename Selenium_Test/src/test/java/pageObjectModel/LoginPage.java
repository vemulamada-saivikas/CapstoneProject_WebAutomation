package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver rdriver) {

        System.out.println("constructor called......");

        driver = rdriver;

    }

    // identification
    By txtEmail = By.id("Email");
    By txtpass = By.cssSelector(".password");
    By lblEmail = By.cssSelector("[for=Email]");

    By chkRem = By.name("RememberMe");
    By btnLogin = By.tagName("button");
    By btnLogout = By.partialLinkText("Logo");

    // Methods
    public void enterEmail(String email) {
        driver.findElement(txtEmail).clear();
        driver.findElement(txtEmail).sendKeys(email); // this.driver
    }

    public boolean verifyEmailTextboxPresent() {
        return driver.findElement(txtEmail).isDisplayed();

    }

    public void verifyEmailLabelPresent() {
        driver.findElement(lblEmail).isDisplayed();

    }

    public void enterPassword(String pwd) {
        driver.findElement(txtpass).clear();
        driver.findElement(txtpass).sendKeys(pwd); // this.driver
    }

    public boolean verifyElementSelected(By locator) {

        return driver.findElement(locator).isSelected();

    }

    public void clickRememberMeCheckbox() {

//      verifyElementSelected(chkRem);

        if (verifyElementSelected(chkRem)) {

            System.out.println("checkbox already selected");
        } 
        else {
            System.out.println("checkbox selected");
            driver.findElement(chkRem).click();
        }

    }

    public void clickLoginButton() {

        driver.findElement(btnLogin).click();

    }

    public void clickLogoutButton() {

        driver.findElement(btnLogout).click();

    }

}


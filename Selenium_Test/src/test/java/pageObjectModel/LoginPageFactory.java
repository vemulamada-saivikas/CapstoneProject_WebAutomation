package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    WebDriver driver;

    public LoginPageFactory(WebDriver rdriver) {

        System.out.println("constructor called......");

        driver = rdriver;
        
        PageFactory.initElements(rdriver, this);

    }

    // identification
//  By txtEmail = By.id("Email");
//  By txtpass = By.cssSelector(".password");
//  By lblEmail = By.cssSelector("[for=Email]");
//
//  By chkRem = By.name("RememberMe");
//  By btnLogin = By.tagName("button");
//  By btnLogout = By.partialLinkText("Logo");

    
    @FindBy(id="Email")
    WebElement txt_Email;
    
    
    @FindBy(how = How.ID, using = "Email")
    WebElement txt_Email1;
    
    
    
    
    
    @FindBy(css =".password")
    WebElement txt_Pass;
    
    @FindBy(css="[for=Email]")
    WebElement lblEmail;
    
    
    @FindBy(name ="RememberMe")
    WebElement chkRem;
    
    
    @FindBy(tagName ="button")
    WebElement btnLogin;
    
    
    @FindBy(partialLinkText ="Logo")
    WebElement btnLogout;
    
    
    
    
    //ruto utility example for PageObject Model
    
//  driver.findElement(By.id("Email")).sendKeys("values to send");
    
    @FindBy(how = How.ID, using="Email")
    private WebElement email;
    
    
    
    public void enterOnEmail(String emailValue){
        
        email.clear();
        email.sendKeys(emailValue);
        
    }
    
    
    
    
    
    
    
    
    // Methods
    public void enterEmail(String email) {
        
        System.out.println("idetification done using page factory");
        txt_Email1.clear();
        txt_Email.sendKeys(email); // this.driver
        
        
        
    }

    public boolean verifyEmailTextboxPresent() {
        return txt_Email.isDisplayed();

    }

    public void verifyEmailLabelPresent() {
        lblEmail.isDisplayed();

    }

    public void enterPassword(String pwd) {
        txt_Pass.clear();
        txt_Pass.sendKeys(pwd); // this.driver
    }

    public boolean verifyElementSelected(WebElement ele) {

        return ele.isSelected();

    }

    public void clickRememberMeCheckbox() {

//      verifyElementSelected(chkRem);

        if (verifyElementSelected(chkRem)) {

            System.out.println("checkbox already selected");
        } 
        else {
            System.out.println("checkbox selected");
            chkRem.click();
        }

    }

    public void clickLoginButton() {

        btnLogin.click();

    }

    public void clickLogoutButton() {

        btnLogout.click();

    }

}


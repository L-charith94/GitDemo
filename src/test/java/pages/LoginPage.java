package pages;

import driver.Core;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="txtUsername")
    public WebElement username;

    @FindBy(id="txtPassword")
    public WebElement password;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

//    public LoginPage(){
//        username = Core.driver.findElement(By.id("txtUsername"));
//        password = Core.driver.findElement(By.id("txtPassword"));
//        loginButton = Core.driver.findElement(By.id("loginButton"));
//    }

    public LoginPage(){
        PageFactory.initElements(Core.driver,this);
    }

    public Boolean setUsername(String username){
        try{
            this.username.sendKeys(username);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }

    public Boolean setPassword(String password){
        try{
            this.password.sendKeys(password);
            return true;
        }catch (Exception ex) {
            return false;
        }
    }

    public Boolean submit(){
        try{
            this.loginButton.click();
            return true;
        }catch (Exception ex) {
            return false;
        }
    }
}

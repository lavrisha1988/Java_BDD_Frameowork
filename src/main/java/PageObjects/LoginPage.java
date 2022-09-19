package PageObjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private By myaccountbtn = By.id("menu-item-57");
    private By username = By.name("username");
    private By password = By.name("password");
    private By loginbtn = By.xpath("//input[@class=\"button\"]");
    private By logoutbtn = By.xpath("//*[contains(text(), 'Log Out')]");

    private By shop = By.id("menu-item-51");
   public LoginPage(WebDriver driver) {
      this.driver = driver;
   }

   public void enter_username_and_password(String Username,String Password){
       driver.findElement(username).sendKeys(Username);
       driver.findElement(password).sendKeys(Password);
    }

    public void login(){
       driver.findElement(loginbtn).click();
    }

    public  void shop(){
        driver.findElement(logoutbtn).isEnabled();
    }
}

package stepDefinitions;
import io.cucumber.java.en.*;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
private WebDriver driver =null;
private LoginPage loginPage;

    @Given("website is open")
    public void website_is_open() {
      String rootPath = System.getProperty("user.dir");
      System.setProperty("webdriver.chrome.driver",rootPath + "/Drivers/chromedriver.exe");

      driver = new ChromeDriver();
      driver.manage().window().maximize();

      loginPage = new LoginPage(driver);
    }
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_test_user_and_tester5027(String username, String password) {
        loginPage.enter_username_and_password(username, password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        loginPage.login();
    }
    @Then("user is on logged in and can navigate to the shop")
    public void user_is_on_logged_in_and_can_navigate_to_the_shop() {

        loginPage.shop();
    }

}

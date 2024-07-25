package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DashboardPage;
import com.juaracoding.pages.LoginPage;
import com.juaracoding.utils.Constant;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class LoginTest {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);

    private static WebDriver driver;

    private static ExtentTest extentTest;

    private static LoginPage loginPage = new LoginPage();

    private static DashboardPage dashboardPage = new DashboardPage();

    public LoginTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        driver.get(Constant.URL);
        driver.manage().window().maximize();
        extentTest.log(LogStatus.PASS, "I am on the login page");
    }

    @When("I enter a valid email and password")
    public void i_enter_a_valid_email_and_password(){
        loginPage.setEmailPassword("admin@hadir.com", "admin@hadir");
        extentTest.log(LogStatus.PASS, "I enter a valid email and password");
    }

    @When("I enter an invalid email and valid password")
    public void i_enter_an_invalid_email_and_valid_password(){
        DriverSingleton.delay(3);
        loginPage.setEmailPassword("adminsa@hadir.com", "admin@hadir");
    }

    @When("I enter an invalid email not input symbol '@' and valid password")
    public void i_enter_an_invalid_email_not_input_symbol(){
        loginPage.setEmailPassword("adminhadir.com", "admin@hadir");
    }

    @When("I enter a valid email and invalid password")
    public void i_enter_a_valid_email_and_invalid_password(){
        loginPage.setEmailPassword("admin@hadir.com", "admin");
    }

    @When("I enter an valid email and not input password")
    public void i_enter_an_valid_and_not_input_password(){
        loginPage.setEmail("admin@hadir.com");
    }

    @When("I enter an invalid password without email")
    public void i_enter_an_invalid_password_without_email(){
        loginPage.setPassword("admin@hadir");
    }

    @When("I am not input email and password")
    public void i_am_not_input_email_and_password(){
        loginPage.clearEmailPassword();
    }

    @And("I click the submit button")
    public void i_click_the_submit_button(){
        DriverSingleton.delay(1);
        loginPage.clickSubmitButton();
        extentTest.log(LogStatus.PASS, "I click the submit button");
    }

    @Then("I should be redirected to the dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page(){
        DriverSingleton.delay(5);
        Assert.assertEquals(driver.getCurrentUrl(), "https://staging-hadir.ptkta.com/dashboards/pending");
        dashboardPage.isLogo();
        extentTest.log(LogStatus.PASS, "I should be redirected to the dashboard page");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message(){
        DriverSingleton.delay(3);
        loginPage.isErrorMessage();
    }

    @Then("I should see an error message '@'")
    public void i_should_see_an_error_message_symbol(){
        DriverSingleton.delay(3);
        loginPage.isErrorNotification();
    }

}

package stepDefinition;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class contactUs_Steps {


    private WebDriver driver;
    contactUs_Page contactUs_page = new contactUs_Page();

    @Given("Navigate to website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }

    @Given("click on contact us button")
    public void click_on_contact_us_button() {
        contactUs_page.clickContactUsButton();
    }

    @Given("type name")
    public void type_name() {
        contactUs_page.setNameInput("Cucumber");
    }

    @Given("type Email")
    public void type_email() {
        contactUs_page.setEmailInput("test@gmail.com");
    }

    @Given("select subject heading")
    public void select_subject_heading() {
        contactUs_page.setSubjectInput("Practice");
    }

    @Given("type a message")
    public void type_a_message() {
        contactUs_page.setMessageInput("An example project to learn Cucumber");
    }

    @When("click on submit button")
    public void click_on_submit_button() throws InterruptedException {
        contactUs_page.clickSubmitButton();
        Thread.sleep(3000); //alert

    }

    @Then("verify success message")
    public void verify_success_message() {
    contactUs_page.assertMyMessage();

    }

}

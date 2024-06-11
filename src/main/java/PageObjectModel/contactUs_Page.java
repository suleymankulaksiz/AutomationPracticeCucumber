package PageObjectModel;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

public class contactUs_Page extends AbstractClass{

    WebDriver driver;

    public contactUs_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath ="/html/body/header/div/div/div/div[2]/div/ul/li[8]/a")
    private WebElement contactUsButton;

    public  void clickContactUsButton(){
        clickFunction(contactUsButton);
    }

    @FindBy(name ="name")
    private WebElement nameInput;
    public void setNameInput(String name){
        sendKeysFunction(nameInput,name);
    }


    @FindBy(name ="email")
    private WebElement emailInput;
    public void setEmailInput(String email){
        sendKeysFunction(emailInput,email);
    }

    @FindBy(name ="subject")
    private WebElement subjectInput;
    public void setSubjectInput(String subject){
        sendKeysFunction(subjectInput,subject);
    }


    @FindBy(name ="message")
    private WebElement messageInput;
    public void setMessageInput(String message){
        sendKeysFunction(messageInput,message);
    }



    @FindBy(name ="submit")
    private WebElement submitButton;
    public void clickSubmitButton(){
        clickFunction(submitButton);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div[2]")
    private WebElement successMessage;
    public void assertMyMessage(){
        Assertion(successMessage,"Success! Your details have been submitted successfully.");

    }

}
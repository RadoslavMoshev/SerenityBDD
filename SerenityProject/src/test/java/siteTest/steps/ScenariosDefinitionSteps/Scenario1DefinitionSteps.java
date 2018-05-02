package siteTest.steps.ScenariosDefinitionSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import siteTest.steps.ScenariosSteps.Scenario1Steps;

@RunWith(SerenityRunner.class)
public class Scenario1DefinitionSteps {

    @Steps
    Scenario1Steps endUser;

    @Managed(driver = "chrome")
    WebDriver driver;
    
    @Given("I am on Login page")
    public void openLoginPage(){
    	endUser.openLoginPage();
    }
    
    @When("I am authenticated")
    public void login(){
    	
    	endUser.enterEmail();
    	endUser.enterPassword();
    	endUser.clickLoginButton();
    }
    
    @Then("I am on My Account Dashboard")
    public void myAccount(){
    	
    	endUser.verifyAccount();
    	endUser.verifyPage();
    }
    
    @Then("Logging out I return to the Login page")
    public void logout(){
    	
    	endUser.clickMyAccount();
    	endUser.clickLogoutButton();
    }
}

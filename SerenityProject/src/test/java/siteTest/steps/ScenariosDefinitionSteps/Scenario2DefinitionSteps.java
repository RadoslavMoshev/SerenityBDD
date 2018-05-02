package siteTest.steps.ScenariosDefinitionSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.runner.RunWith;

import siteTest.steps.ScenariosSteps.Scenario2Steps;


@RunWith(SerenityRunner.class)
public class Scenario2DefinitionSteps {

	@Steps
    Scenario2Steps endUser;
    
    @Given("I am on Logged in")
    public void login(){
    	endUser.openLoginPage();
    	endUser.enterEmail();
    	endUser.enterPassword();
    	endUser.clickLoginButton();
    }
    
    @When("I am at hotels page")
    public void getHotelsPage(){

    	endUser.verifyPage();
    }
    
    @Then("I change the currency")
    public void changeCurrency(){
    	
    	try {
			endUser.changeCurrency();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    @Then("I see prices with the new currency")
    public void verifyChangedCurrency() throws Exception{
    	
    	endUser.verifyChangedCurrency();
    }
}

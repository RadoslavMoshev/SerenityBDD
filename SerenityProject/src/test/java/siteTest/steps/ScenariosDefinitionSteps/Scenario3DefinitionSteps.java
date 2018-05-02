package siteTest.steps.ScenariosDefinitionSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.runner.RunWith;

import siteTest.steps.ScenariosSteps.Scenario3Steps;

@RunWith(SerenityRunner.class)
public class Scenario3DefinitionSteps {
	@Steps
    Scenario3Steps endUser;
	
	@Given("I am logged in and im on hotels page")
    public void login(){
    	endUser.openLoginPage();
    	endUser.enterEmail();
    	endUser.enterPassword();
    	endUser.clickLoginButton();
    	endUser.verifyPage();
    }
	
	@When("I search hotels by star grade")
	public void seachByStarGrade(){
		
		endUser.searchByStarGrade();
	}
	
	@Then("I see only hotels with filtered stars")
	public void verifyStarGrade(){
		
		endUser.verifyStarGrade();
	}
}

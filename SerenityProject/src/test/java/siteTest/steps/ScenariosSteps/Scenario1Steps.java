package siteTest.steps.ScenariosSteps;


import siteTest.pages.LoginPage;
import siteTest.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;

public class Scenario1Steps {

	
    LoginPage loginPage;
    MyAccountPage myAccountPage;
   
    @Step
	public void openLoginPage() {
		
		loginPage.open();
	}

    @Step
	public void enterEmail() {
		
    	loginPage.enterEmail();	
	}

    @Step
	public void enterPassword() {
    	
		loginPage.enterPassword();
	}

    @Step
	public void clickLoginButton() {
		
		loginPage.clickLoginButton();
	}

    @Step
	public void verifyAccount() {

		myAccountPage.verifyAccount();
	}

    @Step
	public void verifyPage() {
    	
    	myAccountPage.verifyPage();
	}

    @Step
	public void clickMyAccount() {
    	
    	myAccountPage.clickMyAccount();
	}

    @Step
	public void clickLogoutButton() {
		
    	myAccountPage.clickLogoutButton();
	}
}
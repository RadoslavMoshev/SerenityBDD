package siteTest.steps.ScenariosSteps;

import net.thucydides.core.annotations.Step;
import siteTest.pages.HotelsPage;
import siteTest.pages.LoginPage;
import siteTest.pages.MyAccountPage;

public class Scenario2Steps {

	LoginPage loginPage;
	MyAccountPage myAccountPage;
	HotelsPage hotelsPage;

	@Step
	public void openLoginPage() {

		loginPage.open();
	}

	@Step
	public void enterEmail() {

		loginPage.enterEmail();
	}

	public void enterPassword() {

		loginPage.enterPassword();
	}

	@Step
	public void clickLoginButton() {

		loginPage.clickLoginButton();
	}
	
	@Step
	public void verifyPage() {
		
		hotelsPage.open();
		hotelsPage.verifyPage();
	}

	@Step
	public void changeCurrency() {
		
		try {
			hotelsPage.changeCurrency();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Step
	public void verifyChangedCurrency() throws Exception {

		hotelsPage.verifyChangedCurrency();
	}
}

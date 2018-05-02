package siteTest.pages;

import static org.junit.Assert.*;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.phptravels.net/account/")
public class MyAccountPage extends PageObject {
	
	@FindBy(xpath = "//*[@id='body-section']/div/div[1]/div/div[1]/h3")
	WebElementFacade verifyAccount;
	public void verifyAccount() {
		
		verifyAccount.containsText("Hi, DVhbCERv IlqEZZxz");
	}

	@FindBy(xpath = "/html/head/title")
	WebElementFacade verifyPage;
	public void verifyPage() {
		String title = getDriver().getTitle();
		
		assertEquals("My Account",title);
		//element(verifyPage).containsText("My Account");
		//assertEquals(verifyPage.getText(),"My Account");
	}
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/ul/li[1]/a")
	WebElementFacade myAccount;
	
	public void clickMyAccount() {
		
		myAccount.click();
	}

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/ul/li[1]/ul/li[2]/a")
	WebElementFacade logoutButton;
	public void clickLogoutButton() {
		
		logoutButton.click();
	}
	
}

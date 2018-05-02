package siteTest.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.phptravels.net/login")
public class LoginPage extends PageObject {

	@FindBy(name = "username")
	WebElementFacade filledEmail;
	
	public void enterEmail() {

		element(filledEmail).type("user@phptravels.com");
	}

	@FindBy(name = "password")
	WebElementFacade filledPassword;
	
	public void enterPassword() {

		element(filledPassword).type("demouser");
	}

	@FindBy(xpath = "//*[@id='loginfrm']/div[1]/div[5]/button")
	WebElementFacade submitButton;
	
	public void clickLoginButton() {
	
		element(submitButton).click();
	}


}

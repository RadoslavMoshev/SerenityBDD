package siteTest.pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.phptravels.net/hotels")
public class HotelsPage extends PageObject {

	@FindBy(xpath = "/html/head/title")
	WebElementFacade verifyPage;
	public void verifyPage() {

		String title = getDriver().getTitle();
		assertEquals("Hotels Listings", title);
	}

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/ul/li[2]/a/strong")
	WebElementFacade currencyButton;
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/ul/li[2]/ul/li[4]/a")
	WebElementFacade currencyChangeToEuro;
	public void changeCurrency() {
		
		element(currencyButton).click();
		element(currencyChangeToEuro.withTimeoutOf(5, TimeUnit.SECONDS)).click();
		//element(currencyChangeToEuro).click();
	}
	
	@FindBy(tagName = "small")  
	List<WebElementFacade> allCurrencies;
	public void verifyChangedCurrency() throws Exception {

		System.out.println(allCurrencies.get(0).getText());
		for (WebElement webElement : allCurrencies) {
			if(webElement.getText().equals("EUR")){
				System.out.println("Currency is changed");
				break;
			}else{
				throw new Exception("Different than expected currency found");
			}
		}
	}
	
	@FindBy(xpath = "//*[@id='collapse1']/div[1]/div/div[9]/label")
	WebElementFacade grade;
	@FindBy(id = "searchform")
	WebElementFacade searchButton;
	public void searchByStarGrade() {
		
		element(grade).click();
		element(searchButton).click();
	}
	
	@FindBy(css = "#body-section > div.container.offset-0 > div.col-md-9.col-xs-12 > div > table > tbody > tr:nth-child(1) > td > div.col-md-8.col-xs-7.g0-left > div > span > i:nth-child(5)")
	WebElementFacade starsFound;
	public void verifyStarGrade() {

		//get 5th start state
		assertEquals("star star icon-star-5", starsFound.getAttribute("class"));
	}
}

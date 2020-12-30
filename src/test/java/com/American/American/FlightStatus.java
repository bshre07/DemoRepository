package com.American.American;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//commit 1

//added line in local machine

//Added this line in repository

public class FlightStatus extends BaseTest {
	@BeforeMethod
	public void NavigateToHomepage() throws InterruptedException {
		getWebDriver().navigate().to(url);
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void verifyPageTitle() {
		String actualTitle = getWebDriver().getTitle();
		Assert.assertTrue(actualTitle.contains("American Airlines"));
	}

	@Test(priority = 2, dataProvider="Airport")
	public void verifyFlightStatusPageTitle(String fromCity, String toCity) {
		HomePage homepage= PageFactory.initElements(getWebDriver(), HomePage.class);
		homepage.selectFlightStatusTab();
		homepage.inputFromCity(fromCity);
		homepage.inputToCity(toCity);
		homepage.clickSearch();
	}

	/*@Test(priority = 3)
	public void veryfyFlightStatusPage() {
		String actualTitle = getWebDriver().getTitle();
		System.out.println(actualTitle);

		Assert.assertTrue(actualTitle.contains("American Airlines"));
	}*/

	@AfterClass
	public void tearDown() {
		getWebDriver().quit();
	}

}

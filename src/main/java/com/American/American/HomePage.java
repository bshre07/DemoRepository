package com.American.American;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(id="jq-flightStatus")
	WebElement flightStatusTab;
	
	public void selectFlightStatusTab() {
		flightStatusTab.click();
	}
	@FindBy(id="originAirport")
	WebElement fromTextBox;
	
	public void inputFromCity(String fromCity) {
		fromTextBox.sendKeys(fromCity);
		
	}
	@FindBy(id= "destinationAirport")
	WebElement toTextBox;
	
	public void inputToCity(String toCity) {
		toTextBox.sendKeys(toCity);
	}
	
	@FindBy(id="flightSchedulesSearchButton")
	WebElement searchBotton;

	public void clickSearch() {
		searchBotton.click();
	}
	
	/*getWebDriver().findElement(By.id("jq-flightStatus")).click();
	 * 
	 
	getWebDriver().findElement(By.id("originAirport")).sendKeys("DFW");
	
	getWebDriver().findElement(By.id("destinationAirport")).sendKeys("ATL");
	
	getWebDriver().findElement(By.id("flightSchedulesSearchButton")).click();*/

}

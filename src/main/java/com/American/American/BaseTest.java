package com.American.American;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest {
	private WebDriver driver;
	protected String url;
	
@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\seleniumdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		this.url = "https://www.aa.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public WebDriver getWebDriver() {
		return driver;
	}
	@DataProvider(name= "airport")
	public static Object[] [] getDataFromProvider(){
		return new Object[] [] {
			{"DFW","ATL"},{"DFW","SFO"}};
	}
}

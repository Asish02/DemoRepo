package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class DealsPage {
	
	WebDriver driver;
	
	public DealsPage(WebDriver driver){
	
		this.driver=driver;
	}
	
	public void dealspage(){
		
		System.out.println("deals page");
	}
	
}

package com.testleaf.pages;



public class HomePage{
	
	
	public LoginPage clickLogOut() {
		clickByClassName("decorativeSubmit");
		return new LoginPage();	
	}
	

	public MyHomePage clickCRMSFA() {
		clickByLinkText("CRM/SFA");
		return new MyHomePage();
		
	}

}

package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.baseclass;

public class homepage {
	
	public  homepage( )
	{
		
		PageFactory.initElements(baseclass.getdriver(), this);
	}
	//By log=By.linkText("SIGN-ON");
	@FindBy (linkText="SIGN-ON") WebElement login;
	@FindBy (linkText="REGISTER") WebElement register;
	@FindBy (linkText="CONTACT") WebElement contact;
	@FindBy (linkText="Flights") WebElement flights;
	@FindBy (linkText="Hotels") WebElement hotels;
	@FindBy (linkText="Car Rentals") WebElement carrentals;
	@FindBy (linkText="Cruises") WebElement crusies;
	@FindBy (linkText="Destinations") WebElement destination;
	@FindBy (linkText="Vacations") WebElement vacation;
	
	
	
	//home page oprtaions
	public void loginoperation()
	{
		login.click();
	}
	public void registeroperation()
	{
		register.click();
	}
	public void contactoperation()
	{
		contact.click();
	}
	public void flightsoperation()
	{
		flights.click();
	}
	public void hotelsoperation()
	{
		hotels.click();
	}
	public void carrentalsoperation()
	{
		carrentals.click();
		
	}
	public void crusiesoperation()
	{
		crusies.click();
	}
	public void destinationoperation()
	{
		destination.click();
	}
	public void vacationoperation()
	{
		vacation.click();
	}
	//homepage validations
		public String verifyhomepageurl()
		{
			return baseclass.getdriver().getCurrentUrl();
		}
		
		public String verifyhomepagetitle()
		{
			return baseclass.getdriver().getTitle();
		}
		

}

package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.baseclass;

public class loginpage {
	
	public  loginpage()
	{
		
		PageFactory.initElements(baseclass.getdriver(), this);

	}
	
	@FindBy (xpath="//input[@name='userName']" ) WebElement username;
	@FindBy (xpath="//input[@name='password']") WebElement password;
	@FindBy (xpath="//input[@name='submit']") WebElement submit;
	@FindBy(xpath="//*[contains(text(),' Thank you for Loggin. ')]") WebElement loginmessage;
	
	
	
public void loginentry(String un,String pd) {
	
	username.sendKeys(un);
	password.sendKeys(pd);
	submit.click();
	
}

public String  validateloginbymsg()
{
	
	 return loginmessage.getText();
	 
}
	

}

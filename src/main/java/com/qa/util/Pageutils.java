package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.baseclass;

public class Pageutils {
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long IMPLICITY_WAIT=30;
	
	//WebDriverWait wait =new WebDriverWait(driver,10);
	//wait.until(expectedcondition.methods);
	
	public static  WebDriverWait webdriverwait(Duration waittime)
	{
		return new WebDriverWait(baseclass.getdriver(),waittime);
	}
	
	public void waituntilclickable(WebElement element,Duration waittime)
	{
		webdriverwait(waittime).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void scrolltoelement (WebElement element)
	{
		JavascriptExecutor executor=(JavascriptExecutor)baseclass.getdriver();
		executor.executeScript("argument[0].scrollintoview(true);",element);
	}
}

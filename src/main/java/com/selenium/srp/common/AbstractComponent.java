package com.selenium.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractComponent {
	
	public abstract boolean isDisplayed();

	//only child can use this instance 
	protected WebDriverWait wait;

    public AbstractComponent(final WebDriver driver){
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

	
}

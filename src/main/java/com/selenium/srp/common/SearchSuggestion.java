package com.selenium.srp.common;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSuggestion  extends AbstractComponent {

	private WebDriverWait wait ;
	
	@FindBy(css = "li.sbct")
	private List <WebElement> suggestions;
	
	public SearchSuggestion(final WebDriver driver)
	{
		super(driver);
	}
	
	
	public void clickSuggestionByIndex(int index)
	{
		this.suggestions.get(index-1).click();
	}
	
	
	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return this.wait.until((driver) -> this.suggestions.size()>5);
	}

	
	
	
}

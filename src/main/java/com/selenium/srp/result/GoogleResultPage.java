package com.selenium.srp.result;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.srp.common.SearchSuggestion;
import com.selenium.srp.common.SearchWidget;

public class GoogleResultPage {
	//Collection of component and this page returns only that component 
	
private SearchWidget searchWidget;
private SearchSuggestion searchSuggestion;
private NavigationBar navigationBar;
private ResultStat resultStat;

public GoogleResultPage(final WebDriver driver){
    this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
    this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
    this.navigationBar = PageFactory.initElements(driver, NavigationBar.class);
    this.resultStat = PageFactory.initElements(driver, ResultStat.class);
}

public SearchWidget getSearchWidget() {
    return searchWidget;
}

public SearchSuggestion getSearchSuggestion() {
    return searchSuggestion;
}

public NavigationBar getNavigationBar() {
    return navigationBar;
}

public ResultStat getResultStat() {
    return resultStat;
}
}
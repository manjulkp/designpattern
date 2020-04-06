package factorytest;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.designpattern.test.BaseTest;
import com.selenium.factory.GoogleFactory;
import com.selenium.factory.GooglePage;

public class GoogleSearchTest extends BaseTest {

    private GooglePage googlePage;

    @Test(dataProvider = "getData")
    public void searchTest(String language, String keyword){
       //factory create the object 
    	//bad code
    	// we are not supposed to create the object 
    	//only factory can do the object creation
    	//new GoogleEnglish();---bad code 
    	this.googlePage = GoogleFactory.get(language, this.driver);
        this.googlePage.launchSite();
        this.googlePage.search(keyword);
        int resultCount = this.googlePage.getResultsCount();
        System.out.println("Result Count : " + resultCount);
    }

    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"ENG", "selenium"},
                {"FR", "design patterns"},
                {"SA", "docker"},
                {"ES", "selenium"}
        };
    }

}
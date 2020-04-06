package Command;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.designpattern.test.BaseTest;

import command.ElementValidator;
import command.HomePage;

public class HomePageTest extends BaseTest {

    private HomePage homePage;

    @BeforeTest
    public void setHomePage(){
        this.homePage = new HomePage(driver);
    }

    //list of all the element validator
    //iterate through the loop and validate
    //instead for each ,we call map which returna a boolean 
    // then validate using assert 
    
    @Test
    public void homePageTest(){
        this.homePage.goTo();
//        for(ElementValidator ev: this.homePage.getElementValidators())
//        {
//        boolean result = ev.validate();
//        }
        this.homePage.getElementValidators()
                .stream()
                .parallel()
                .map(ev -> ev.validate())
                .forEach(b -> Assert.assertTrue(b));
    }

}

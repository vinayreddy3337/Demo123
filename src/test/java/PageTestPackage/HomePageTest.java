package PageTestPackage;

import BasePackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    HomePage hp;
    LoginPage lp;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        Intialization();
         hp=new HomePage(driver);
    }
    @AfterMethod
    public void Teardown(){
       driver.close();
    }
    @Test
    public void Testlogo(){
        boolean logo= hp.CheckWbLogo();
        Assert.assertTrue(logo);
    }
    @Test
    public void TestFreestudent(){
        boolean student= hp.CheckFreeStudent();
        Assert.assertTrue(student);
    }

    @Test
    public void verifylogin(){

        hp.ClickLogin();
    }


}

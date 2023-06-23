package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath="//img[@id=\"logo\"]")
    WebElement wbllogo;

    @FindBy(xpath="//button[@id=\"headerfblogin\"]")
    WebElement freestudent;

    @FindBy(id="loginButton")
    WebElement loginbtn;

    public HomePage(WebDriver driver){ //cons
        this.driver=driver;
        PageFactory.initElements(driver,this);


    }


    public boolean CheckWbLogo(){
        return wbllogo.isDisplayed();
    }

    public boolean CheckFreeStudent(){
        return freestudent.isDisplayed();
    }

    public LoginPage ClickLogin(){
        loginbtn.click();
        return new LoginPage(driver);
    }


}

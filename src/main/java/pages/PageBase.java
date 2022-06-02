package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    // this is the driver which will be used in the classes
    protected WebDriver driver;

    // create constructor
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
}

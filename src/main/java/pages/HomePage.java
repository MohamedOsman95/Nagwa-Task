package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[2]/ul/li[1]/a")
    WebElement english_button;

    @FindBy(xpath = "//div[3]/button/i[@class='f-icon search-icon']")
    WebElement search_icon;

    @FindBy(xpath = "//label/input[@id='txt_search_query']")
    WebElement textSearch_Box;

    @FindBy(id = "btn_global_search")
    WebElement searchIconSubmit;

    @FindBy(xpath = "//ul/li[2]/div/a")
    WebElement second_lesson;

    public void clickEnglishButton() {
        english_button.click();
    }

    public void clickSearchIcon() {
        search_icon.click();
    }

    public void writeTextSearchBox(String search_value) {
        textSearch_Box.click();
        textSearch_Box.clear();
        textSearch_Box.sendKeys(search_value);
    }

    public void clicksearchIconSubmit() {
        searchIconSubmit.click();
    }

    public void clickSecondLesson() {
        second_lesson.click();
    }


}

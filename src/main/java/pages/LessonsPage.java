package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class LessonsPage extends PageBase{
    public LessonsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//section[6]/div/div[2]/div/a")
    WebElement worksheet_section;

    public void clickWorkSheetSection()
    {
        worksheet_section.click();
    }

    public int countQuestions()
    {
        List<WebElement> questionslist = driver.findElements(By.xpath(".//main/div[2]/div"));
        return questionslist.size();
    }
}

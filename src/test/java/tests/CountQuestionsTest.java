package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LessonsPage;

public class CountQuestionsTest extends TestBase {

    HomePage homePageObject;
    LessonsPage lessonObject;
    @Test
    public void userCountQuestionLessons() throws InterruptedException {
        //This test case for count the questions
        homePageObject = new HomePage(driver);
        homePageObject.clickEnglishButton();
        homePageObject.clickSearchIcon();

        homePageObject.writeTextSearchBox("Addition");
        homePageObject.clicksearchIconSubmit();
        homePageObject.clickSearchIcon();
        Thread.sleep(3000);
        homePageObject.clickSecondLesson();

        lessonObject = new LessonsPage(driver);
        lessonObject.clickWorkSheetSection();
        int question_count = lessonObject.countQuestions();
        System.out.println("The count of questions is "+ question_count);

    }
}

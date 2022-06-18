package starter.wikipedia;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.reports.OutcomeFormat;
import net.thucydides.core.reports.TestOutcomeLoader;
import net.thucydides.core.reports.TestOutcomes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @Test
    void test1() {
        assertThat("pass", true, equalTo(true));
    }

    @Test
    void test2() {

        assertThat("fail", true, equalTo(false));
    }

    @Test
    void test3() {

        assertThat("fail", true, equalTo(false));
    }

    @Test
    void test4() {

        assertThat("fail", true, equalTo(false));
    }

    @Test
    void test5() {

        assertThat("pass", true, equalTo(true));
    }


   /*
   @CastMember(name = "Wendy")
    Actor wendy;

    @Test
    void searchBySingleKeyword() {
        wendy.attemptsTo(
                Navigate.toTheHomePage(),
                Search.byKeyword("Everest"),
                Ensure.that(DisplayedArticle.firstHeading()).isEqualTo("Mount Everest")
        );
    }*/

   /* @Test
    void getTestInfo() throws IOException {
        final String serenityReportPath = "/target/site/serenity";
        OutcomeFormat format = OutcomeFormat.JSON;
        Path currentWorkingDir = Paths.get("").toAbsolutePath();

        File file = new File(currentWorkingDir + serenityReportPath);

        TestOutcomes outcomes = TestOutcomeLoader.loadTestOutcomes().inFormat(format).from(file);
        System.out.println("escnarios fallidos: " + outcomes.getFailingTests().getScenarioCount());
        System.out.println("escnarios satisfactorios: " + outcomes.getPassingTests().getScenarioCount());

        for (final TestOutcome outcome : outcomes.getOutcomes()) {
            System.out.println("***************");
            System.out.println("description text: " + outcome.getDescriptionText());
            System.out.println("description text: " + outcome.getErrorMessage());
            System.out.println("complete name: " + outcome.getCompleteName());
            System.out.println("test case name:" + outcome.getTestCaseName());
            System.out.println("result: " + outcome.getResult().getAdjective());
            System.out.println("duration in seconds: " + outcome.getDurationInSeconds());
            System.out.println("data table: " + outcome.getDataTable()); // if test was with some data table
            System.out.println("issue keys: " + outcome.getIssueKeys());
            System.out.println("***************");
        }

    }*/
    /*

    @AfterEach
    void getData(){
        double duration = StepEventBus.getEventBus().getBaseStepListener().latestTestOutcome().get().getDurationInSeconds();
        String completeName = StepEventBus.getEventBus().getBaseStepListener().latestTestOutcome().get().getCompleteName();
        String id = StepEventBus.getEventBus().getBaseStepListener().latestTestOutcome().get().getId();
        String name = StepEventBus.getEventBus().getBaseStepListener().latestTestOutcome().get().getName();
    }*/

}

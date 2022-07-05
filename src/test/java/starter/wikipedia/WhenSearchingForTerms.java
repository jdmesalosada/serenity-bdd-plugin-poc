package starter.wikipedia;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import net.serenitybdd.screenplay.annotations.CastMember;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingForTerms {

    @CastMember(name = "Wendy")
    Actor wendy;

    @Test
    void searchBySingleKeyword() throws InterruptedException {
       // Thread.sleep(20000);
        assertThat("failed because ..", true, equalTo(true));
    }

    @Test
    void searchAnotherThing() throws InterruptedException {
        //Thread.sleep(50000);

        assertThat("failed because ..", true, equalTo(false));
    }

    @Test
    void searchForFoo() throws InterruptedException {
        //Thread.sleep(30000);
        assertThat("failed because ..", true, equalTo(false));
    }

    @Test
    void searchForBar() throws InterruptedException {
        //Thread.sleep(60000);
        assertThat("failed because ..", true, equalTo(true));
    }
}

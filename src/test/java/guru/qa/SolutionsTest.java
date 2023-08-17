package guru.qa;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class SolutionsTest extends TestBase {

    @Test
    void checkSolution() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".header-menu-wrapper").$(byText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));

    }

}

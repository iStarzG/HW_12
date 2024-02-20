package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class SelenideTest extends TestBase {
    @Test
    @Owner("iStarzG")
    @DisplayName("Проверка корректности имени Issue на странице Issue с помощью чистого Selenide")
    public void checkIssueWithSelenide() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    open("https://github.com/");
    $(".header-search-button").click();
    $("#query-builder-test").setValue("eroshenkoam/allure-example").submit();
    $(linkText("eroshenkoam/allure-example")).click();
    $("#issues-tab").click();
    $(withText("#80")).should(Condition.exist);
}
}

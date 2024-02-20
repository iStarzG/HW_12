package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    @BeforeAll
    @Owner("iStarzG")
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.timeout = 10000;
        System.out.println("\n\nTest Started!\n");


    }

    @AfterAll
    static void afterAll() {
        System.out.println("\nTest Finished\n\n");
    }
}

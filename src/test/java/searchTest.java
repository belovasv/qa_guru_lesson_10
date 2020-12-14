import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class searchTest {

        static String remoteBrowserUrl = System.getProperty("remote.browser.url","selenoid.autotests.cloud");

        @BeforeAll
        static void setup (){
            Configuration.startMaximized = true;
            Configuration.remote = "https://user1:1234@" + remoteBrowserUrl + ":4444/wd/hub/";
        }

        @Test
        void searchWeatherByYandex() {
                open("https://yandex.ru/");
                $("#text").val("Погода").pressEnter();
                $("body").shouldHave(Condition.text("gismeteo.ru"));
        }

        @AfterEach
        public void afterEach(){
            closeWebDriver();
        }

}

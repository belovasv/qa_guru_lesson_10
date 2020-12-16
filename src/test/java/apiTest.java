import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class apiTest {

    @Test
    void api() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);
        System.out.println(apiConfig.pass());
        System.out.println(apiConfig.login());
        System.out.println(apiConfig.apiUrl());

    }
}

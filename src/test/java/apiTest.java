import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class apiTest {

    @Test
    void api() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);
        System.out.println(apiConfig.apiUrl());

    }
}

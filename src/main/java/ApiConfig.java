import org.aeonbits.owner.Config;

@Config.Sources({
        "system:properties",
        "file:~/token.properties"
})
public interface ApiConfig extends Config {

    @Key("apiUrl")
    String apiUrl();

    @Key("password")
    String pass();

    @Key("login")
    String login();
}

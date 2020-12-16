import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:~/token.properties"
})
public interface ApiConfig extends Config {

    @DefaultValue("someUrl")
    @Key("apiUrl")
    String apiUrl();

    @DefaultValue("${password}")
    @Key("password")
    String pass();

    @DefaultValue("${login}")
    @Key("login")
    String login();
}

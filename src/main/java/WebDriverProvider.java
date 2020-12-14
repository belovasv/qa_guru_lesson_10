import org.aeonbits.owner.Config;


@Config.Sources({
        "system:properties",
        "classpath:${environment}.properties"
})
public interface WebDriverProvider extends Config {

    @Key("password")
    String searchPassword();

    @Key("search.site")
    String searchSite();

    @Key("search.item")
    String searchItem();

    @Key("search.result")
    String searchResult();

    @Key("webdriver.remote")
    String webdriverRemote();
}


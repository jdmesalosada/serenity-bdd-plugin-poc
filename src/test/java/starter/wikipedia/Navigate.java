package starter.wikipedia;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {
    /**
     * An action that opens the browser on the Wikipedia home page
     */
    public static Performable toTheHomePage() {
        return Open.url("http://wikipedia.com/");
    }
}

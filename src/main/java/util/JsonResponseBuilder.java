package util;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

/**
 * Created by RoyH- on 10-6-2018.
 */
public class JsonResponseBuilder {

    public static String createJsonResponse(String key, String value) {
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add(key, value);
        return job.build().toString();
    }

    public static String createBMIResponse(double BMI) {
        return createJsonResponse("BMI", BMI + "");
    }

}

package restservice;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;

@Path("myresource")
public class MyResource {

    @POST
    public String getOrderInfo(@FormParam("leeftijd") double leeftijd, @FormParam("gewicht") double gewicht) {
        BMI w = new BMI();
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("BMI", w.getBmi(leeftijd,gewicht));
        return job.build().toString();
    }
}
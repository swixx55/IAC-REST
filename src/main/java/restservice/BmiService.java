package restservice;

import model.Geslacht;
import model.Person;
import util.BMIUtil;
import util.JsonResponseBuilder;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.*;

@Path("BMI")
public class BmiService {

    @GET
    @Produces("application/json")
    public String getBmiNeutraal(@QueryParam("leeftijd") int leeftijd, @QueryParam("gewicht") double gewicht, @QueryParam("lengte") double lengte) {
        Person person = new Person(gewicht, lengte, Geslacht.Neutraal, leeftijd);
        return JsonResponseBuilder.createBMIResponse(BMIUtil.calculateBMIFor(person));
    }

    @GET
    @Path("/man")
    @Produces("application/json")
    public String getBmiMan(@QueryParam("leeftijd") int leeftijd, @QueryParam("gewicht") double gewicht, @QueryParam("lengte") double lengte) {
        Person person = new Person(gewicht, lengte, Geslacht.Man, leeftijd);
        return JsonResponseBuilder.createBMIResponse(BMIUtil.calculateBMIFor(person));
    }

    @GET
    @Path("/vrouw")
    @Produces("application/json")
    public String getBmiVrouw(@QueryParam("leeftijd") int leeftijd, @QueryParam("gewicht") double gewicht, @QueryParam("lengte") double lengte) {
        Person person = new Person(gewicht, lengte, Geslacht.Vrouw, leeftijd);
        return JsonResponseBuilder.createBMIResponse(BMIUtil.calculateBMIFor(person));
    }

    @GET
    @Path("/check")
    @Produces("application/json")
    public String getBmiCheck(@QueryParam("leeftijd") int leeftijd, @QueryParam("gewicht") double gewicht, @QueryParam("lengte") double lengte, @QueryParam("lengte") Geslacht geslacht) {
        Person person = new Person(gewicht, lengte, geslacht, leeftijd);
        return JsonResponseBuilder.createJsonResponse("GoodBMI", BMIUtil.hasPersonGoodBMI(person) + "");
    }
}
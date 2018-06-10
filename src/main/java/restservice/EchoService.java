package restservice;

import util.JsonResponseBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * Created by RoyH- on 07-6-2018.
 */
@Path("/echo")
public class EchoService {

    @GET
    @Path("/hi")
    public String sayHi(){
        return JsonResponseBuilder.createJsonResponse("message", "hi!");
    }

    @GET
    public String echo(@QueryParam("message") String message){
        return JsonResponseBuilder.createJsonResponse("echo", message);
    }
}

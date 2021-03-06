package com.gallup.gethip.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// The Java class will be hosted at the URI path "/homepage"
@Path("/")
public class Homepage {

    // TODO: update the class to suit your needs
    
    // The Java method will process HTTP GET requests
    @GET 
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/plain")
    public String getIt() {
        return "Welcome to the Ski App!";
    }
}

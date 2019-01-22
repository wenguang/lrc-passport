package bpassport.jersey;

import javax.ws.rs.Path;

@Path("passport")
public class PassportService {

    @Path("login")
    public String login() {
        return "";
    }
}

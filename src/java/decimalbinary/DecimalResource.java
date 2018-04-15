package decimalbinary;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/decBin")
public class DecimalResource {

    @GET
    public String decimal(@QueryParam("decimal") long decimal) {
        return Long.toString(xdecimal(decimal));
    }

    long xdecimal(long decimal) {
        String binary = "";
        while(decimal>0){
            binary=(decimal%2)+binary;
            decimal=decimal/2;
        }
        return Long.parseLong(binary);
    }
}
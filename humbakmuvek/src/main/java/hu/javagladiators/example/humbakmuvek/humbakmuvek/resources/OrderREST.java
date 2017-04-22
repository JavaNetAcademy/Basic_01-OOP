package hu.javagladiators.example.humbakmuvek.humbakmuvek.resources;

import hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels.Orders;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @author krisztian
 */
@Path("/kosar")
public class OrderREST {
    

    @POST
    @Path("save")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public boolean save(@Context HttpServletResponse response, Orders order){
        response.setHeader("Access-Control-Allow-Origin", "*");
        
        return true;
    }    
}

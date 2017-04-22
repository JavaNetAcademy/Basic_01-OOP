package hu.javagladiators.example.humbakmuvek.humbakmuvek.resources;

import hu.javagladiators.example.humbakmuvek.humbakmuvek.DataStore;
import hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels.DrinkList;
import hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels.Orders;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @author krisztian
 */
@Path("/kocsma")
public class DrinkListREST {
    
 @GET
    @Path("get")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public DrinkList get(@Context HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        return DataStore.getInstance().getDrinks();
    }
    
    
}

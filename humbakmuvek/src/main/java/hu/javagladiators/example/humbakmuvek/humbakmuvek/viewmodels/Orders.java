package hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisztian
 */
public class Orders {
   private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<OrderItem> getList() {
        return list;
    }

    public void setList(List<OrderItem> list) {
        this.list = list;
    }
   private List<OrderItem> list = new ArrayList<OrderItem>();

    public Orders() {
    }
   
   
}

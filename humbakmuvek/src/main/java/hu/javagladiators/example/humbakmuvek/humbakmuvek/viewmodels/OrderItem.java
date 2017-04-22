package hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels;

/**
 *
 * @author krisztian
 */
public class OrderItem {
    private long drinkid;
    private byte count;
    private long capacity;

    public OrderItem() {
    }

    public OrderItem(long drinkid, byte count, long capacity) {
        this.drinkid = drinkid;
        this.count = count;
        this.capacity = capacity;
    }

    public long getDrinkid() {
        return drinkid;
    }

    public void setDrinkid(long drinkid) {
        this.drinkid = drinkid;
    }

    public byte getCount() {
        return count;
    }

    public void setCount(byte count) {
        this.count = count;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    
    
    
}

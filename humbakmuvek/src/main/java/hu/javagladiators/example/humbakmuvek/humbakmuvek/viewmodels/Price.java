package hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels;

/**
 * @author krisztian
 */
public class Price {
    private long id;
    private String unit;
    private long capacity;
    private double price;

    public Price() {
    }

    public Price(String unit, long capacity, double price) {
        this.unit = unit;
        this.capacity = capacity;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
	

}

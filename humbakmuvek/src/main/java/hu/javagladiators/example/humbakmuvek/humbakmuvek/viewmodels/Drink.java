package hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisztian
 */
public class Drink {
    private static long sequence=0; 
    private long id;
    private String name;
    private String tyype;
    private double alcohol;
    private List<Price> prices = new ArrayList<Price>();

    public Drink() {
        sequence ++;
        setId(sequence);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public Drink(String name, String tyype, double alcohol) {
        this();
        this.name = name;
        this.tyype = tyype;
        this.alcohol = alcohol;
    }

    public Drink(String name, String tyype) {
        this.name = name;
        this.tyype = tyype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTyype() {
        return tyype;
    }

    public void setTyype(String tyype) {
        this.tyype = tyype;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }
    
    public void addPrice(Price price){
        price.setId(prices.size());
        prices.add(price);
    }
}

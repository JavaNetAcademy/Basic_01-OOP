package hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krisztian
 */
public class DrinkList {
    private List<Drink> spirits = new ArrayList<Drink>();
    private List<Drink> wines = new ArrayList<Drink>();
    private List<Drink> beers = new ArrayList<Drink>();

    public DrinkList() {
    }

    public List<Drink> getSpirits() {
        return spirits;
    }

    public void setSpirits(List<Drink> spirits) {
        this.spirits = spirits;
    }

    public List<Drink> getWines() {
        return wines;
    }

    public void setWines(List<Drink> wines) {
        this.wines = wines;
    }

    public List<Drink> getBeers() {
        return beers;
    }

    public void setBeers(List<Drink> beers) {
        this.beers = beers;
    }
    
    public void addBeer(Drink beer) {beers.add(beer);}
    public void addWine(Drink wine) {wines.add(wine);}
    public void addSpirit(Drink spirit){spirits.add(spirit);} 
    
}

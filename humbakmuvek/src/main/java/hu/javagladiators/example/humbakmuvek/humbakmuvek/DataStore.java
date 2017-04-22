package hu.javagladiators.example.humbakmuvek.humbakmuvek;

import hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels.Drink;
import hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels.DrinkList;
import hu.javagladiators.example.humbakmuvek.humbakmuvek.viewmodels.Price;

/**
 * @author krisztian
 */
public class DataStore {
    private static final DataStore instance = new DataStore();
    private DrinkList drinks = new DrinkList();

    public DataStore() {
        Drink szolo = new Drink("Szőlő pálinka", "kimért",80);
        szolo.addPrice(new Price("cl", 4, 800));
        szolo.addPrice(new Price("cl", 2, 500));
        drinks.addSpirit(szolo);

        Drink alma = new Drink("Alma pálinka", "kimért",40);
        alma.addPrice(new Price("cl", 4, 800));
        alma.addPrice(new Price("cl", 2, 500));
        drinks.addSpirit(alma);
        
        Drink csiki = new Drink("Csíki igazi", "üveg", 5);
        csiki.addPrice(new Price("deci", 5, 300));
        drinks.addBeer(csiki);
        
        Drink dorobor = new Drink("Dorombor (nem száraz)", "palack", 6);
        dorobor.addPrice(new Price("deci", 7, 1200));
        drinks.addWine(dorobor);
    }
    
    
    public static DataStore getInstance() {
        return instance;
    }

    public DrinkList getDrinks() {
        return drinks;
    }
    
    
    
    
}

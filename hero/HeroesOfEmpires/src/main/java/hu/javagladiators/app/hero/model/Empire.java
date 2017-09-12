/*
 */
package hu.javagladiators.app.hero.model;

import java.util.List;

/**
 * @author krisztian
 */
public class Empire extends Location{
    private Location capital;
    private Province[] provinces;
    
    {
        provinces = new Province[10];
    }

    public Empire() {
    }

    public Empire(String name, String description) {
        super(name, description);
    }

    public Location getCapital() {
        return capital;
    }

    public void setCapital(Location capital) {
        this.capital = capital;
    }

    public Province[] getProvinces() {
        return provinces;
    }

    public void setProvinces(Province[] provinces) {
        this.provinces = provinces;
    }    
}

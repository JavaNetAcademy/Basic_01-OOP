/*
 */
package hu.javagladiators.app.hero.model;

import java.util.List;

/**
 * @author krisztian
 */
public class Province extends Location{
    private Location central;
    private Location[] locations = new Location[10];

    public Province() {
    }

    public Province(String name, String description) {
        super(name, description);
    }

    
    
    public Location getCentral() {
        return central;
    }

    public void setCentral(Location central) {
        this.central = central;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
    
}

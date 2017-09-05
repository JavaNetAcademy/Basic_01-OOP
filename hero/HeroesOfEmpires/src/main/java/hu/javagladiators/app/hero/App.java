/*
 */
package hu.javagladiators.app.hero;

import hu.javagladiators.app.hero.model.AdministratorType;
import hu.javagladiators.app.hero.model.Empire;
import hu.javagladiators.app.hero.model.Hero;
import hu.javagladiators.app.hero.model.Location;
import hu.javagladiators.app.hero.model.Province;
import hu.javagladiators.app.hero.model.WorkPlace;
import hu.javagladiators.app.hero.model.WorkPlaceEmpireFull;
import hu.javagladiators.app.hero.model.WorkPlaceProvincePart;
import java.util.Date;
import java.util.List;

/**
 * @author krisztian
 */
public class App {
    
    private static final Hero[] heroes = new Hero[3];
    private static final Empire empire = new Empire("A empire","..");
    private static final WorkPlace[] works = new WorkPlace[2];
    private static final AdministratorType mayor = new AdministratorType("Polgármester", (byte)1);
    private static final AdministratorType deputyMayor = new AdministratorType("Polgármester helyettes", (byte)2);

    static {
        heroes[0]=new Hero("Pókember", "...", true);
        heroes[1]=new Hero("Hulk", "...", true);
        heroes[2]=new Hero("Alien", "...", false);
        
        empire.addProvince(new Province("A province", null));
        empire.getProvinces().get(0).addLocation(new Location("A Location", null));
        empire.getProvinces().get(0).addLocation(new Location("B Location", null));
        empire.addProvince(new Province("B province", null));
        empire.addProvince(new Province("C province", null));
        
        WorkPlace wpEmpireFull = new WorkPlaceEmpireFull();
        wpEmpireFull.setHero(heroes[0]);
        wpEmpireFull.setValidityEnd(new Date());
        ((WorkPlaceEmpireFull)wpEmpireFull).setEmpire(empire);
        wpEmpireFull.setType(mayor);
        works[0] = wpEmpireFull;

        WorkPlaceProvincePart wpProvincePart = new WorkPlaceProvincePart();
        wpProvincePart.setHero(heroes[1]);
        wpProvincePart.setValidityEnd(new Date());
        wpProvincePart.setEmpire(empire);
        wpProvincePart.addLocation(empire.getProvinces().get(0).getLocations().get(0));
        wpProvincePart.setType(deputyMayor);
        works[1] = wpProvincePart;
        
    }
    
    public static void main(String[] args) {
        
        for(Hero hero:heroes){
            if(!hero.isAvailable())
                System.out.println(hero.getName()+" szabadságon van");
        }
    }
    
    private static Hero getMainAvailableHero(Location pLocation){
        return null;
    }
    
    private static List<Hero> getAvailableHeroes(Location pLocation){
        return null;
    }

}

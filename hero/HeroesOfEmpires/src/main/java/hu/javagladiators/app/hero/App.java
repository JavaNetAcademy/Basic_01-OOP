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
import hu.javagladiators.app.hero.model.WorkPlaceEmpirePart;
import hu.javagladiators.app.hero.model.WorkPlaceProvinceFull;
import hu.javagladiators.app.hero.model.WorkPlaceProvincePart;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author krisztian
 */
public class App {
    
    private static final Hero[] heroes = new Hero[3];
    private static final Empire empire = new Empire("A empire","..");
    private static final WorkPlace[] works = new WorkPlace[2];
    private static final AdministratorType mayor = new AdministratorType((byte)1);
    private static final AdministratorType deputyMayor = new AdministratorType( (byte)2);

    static {
        heroes[0]=new Hero("Pókember", "...", true);
        heroes[1]=new Hero("Hulk", "...", true);
        heroes[2]=new Hero("Alien", "...", false);
        
        empire.getProvinces()[0] = new Province("A province", null);
        empire.getProvinces()[0].getLocations()[0] = new Location("A Location", null);
        empire.getProvinces()[0].getLocations()[0] = new Location("B Location", null);
        empire.getProvinces()[1] = new Province("B province", null);
        empire.getProvinces()[2] = new Province("C province", null);
        
        WorkPlace wpEmpireFull = new WorkPlaceEmpireFull();
        wpEmpireFull.setHero(heroes[0]);
        wpEmpireFull.setValidityStart(new Date());
        wpEmpireFull.setValidityEnd(new Date(System.currentTimeMillis()+1000*60*60*24*10));
        ((WorkPlaceEmpireFull)wpEmpireFull).setEmpire(empire);
        wpEmpireFull.setType(mayor);
        works[0] = wpEmpireFull;

        WorkPlaceProvincePart wpProvincePart = new WorkPlaceProvincePart();
        wpProvincePart.setHero(heroes[1]);
        wpProvincePart.setValidityStart(new Date());
        wpProvincePart.setValidityEnd(new Date(System.currentTimeMillis()+1000*60*60*24*10));
        wpProvincePart.setEmpire(empire);
        wpProvincePart.setProvince(empire.getProvinces()[0]);
        wpProvincePart.getLocations()[0] = empire.getProvinces()[0].getLocations()[0];
        wpProvincePart.setType(mayor);
        works[1] = wpProvincePart;
        
    }
    
    public static void main(String[] args) {
        
        for(Hero hero:heroes){
            if(!hero.isAvailable())
                System.out.println(hero.getName()+" szabadságon van");
        }
        System.out.println(getMainAvailableHero(empire.getProvinces()[0].getLocations()[0]).getName());
    }
    
    private static boolean isInclude(Location pLocation, Empire pEmpire){
        for(Province province : pEmpire.getProvinces()){
            if(isInclude(pLocation, province))
                return true;
        }
        return false;
    }

    private static boolean isInclude(Location pLocation, Province pProvince){
        for(Location location : pProvince.getLocations())
            if(location.equals(pLocation))
                return true;
        return false;
    }
    
    private static Hero getMainAvailableHero(Location pLocation){
        
        for(WorkPlace wp : works){
            if(wp.isActive(new Date()) && wp.getType().equals(mayor) && wp.getHero().isAvailable()){
                if(wp instanceof WorkPlaceEmpireFull){
                    WorkPlaceEmpireFull tmpWP = (WorkPlaceEmpireFull)wp;
                    if(isInclude(pLocation, empire))
                        return tmpWP.getHero();
                }
                
                if(wp instanceof WorkPlaceProvinceFull){
                    WorkPlaceProvinceFull tmpWP = (WorkPlaceProvinceFull)wp;
                    if(tmpWP.getEmpire().equals(empire)){
                        if(isInclude(pLocation, tmpWP.getProvince()))
                           return tmpWP.getHero();
                    }
                }
                
                if(wp instanceof WorkPlaceEmpirePart){
                    WorkPlaceEmpirePart tmpWP = (WorkPlaceEmpirePart)wp;
                    if(isInclude(pLocation, empire)){
                        for(Province province : tmpWP.getProvinces())
                            if(isInclude(pLocation, province))
                                return tmpWP.getHero();
                    }
                }

                if(wp instanceof WorkPlaceProvincePart){
                    WorkPlaceProvincePart tmpWP = (WorkPlaceProvincePart)wp;
                    if(isInclude(pLocation, empire)){
                        if(isInclude(pLocation, tmpWP.getProvince()))
                           return tmpWP.getHero();
                    }
                }
                
            }
        
        }
        
        return null;
    }
    
    private static Set<Hero> getAvailableHeroes(Location pLocation){
        Set<Hero> availables = new HashSet<>();
        for(WorkPlace wp : works){
            if(wp.isActive(new Date()) && wp.getHero().isAvailable()){
                if(wp instanceof WorkPlaceEmpireFull){
                    WorkPlaceEmpireFull tmpWP = (WorkPlaceEmpireFull)wp;
                    if(isInclude(pLocation, empire))
                        availables.add(tmpWP.getHero());
                }
                
                if(wp instanceof WorkPlaceProvinceFull){
                    WorkPlaceProvinceFull tmpWP = (WorkPlaceProvinceFull)wp;
                    if(tmpWP.getEmpire().equals(empire)){
                        if(isInclude(pLocation, tmpWP.getProvince()))
                            availables.add(tmpWP.getHero());
                    }
                }
                
                if(wp instanceof WorkPlaceEmpirePart){
                    WorkPlaceEmpirePart tmpWP = (WorkPlaceEmpirePart)wp;
                    if(isInclude(pLocation, empire)){
                        for(Province province : tmpWP.getProvinces())
                            if(isInclude(pLocation, province))
                                availables.add(tmpWP.getHero());
                    }
                }

                if(wp instanceof WorkPlaceProvincePart){
                    WorkPlaceProvincePart tmpWP = (WorkPlaceProvincePart)wp;
                    if(isInclude(pLocation, empire)){
                        if(isInclude(pLocation, tmpWP.getProvince()))
                            availables.add(tmpWP.getHero());
                    }
                }                
            }        
        }
        
        return availables;
    }

}

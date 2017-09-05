/*
 */
package hu.javagladiators.app.hero.model;

import java.util.Date;
import java.util.Objects;

/**
 * @author krisztian
 */
public class Action {
    private String name;
    private Date date;
    private Location location;
    private Hero hero;

    public Action() {
    }

    public Action(String name, Date date, Location location, Hero hero) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.hero = hero;
    }

    public Action(String name, Date date, Location location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Action other = (Action) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Action{" + "name=" + name + ", date=" + date + ", location=" + location.getName() + '}';
    }
    
    
}

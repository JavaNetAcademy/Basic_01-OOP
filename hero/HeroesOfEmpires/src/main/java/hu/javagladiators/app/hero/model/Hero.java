/*
 */
package hu.javagladiators.app.hero.model;

import java.util.Objects;

/**
 * @author krisztian
 */
public class Hero {
    private String name;
    private String description;
    private boolean available;

    public Hero() {
    }
    
    public Hero(String name, String description, boolean available) {
        this.name = name;
        this.description = description;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
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
        final Hero other = (Hero) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hero{" + "name=" + name + '}';
    }
    
}

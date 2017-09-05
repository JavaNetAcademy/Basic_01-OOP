/*
 */
package hu.javagladiators.app.hero.model;

import java.util.Objects;

/**
 * @author krisztian
 */
public class AdministratorType {
    private String name;
    private byte prioritization;

    public AdministratorType() {
    }

    public AdministratorType(String name, byte prioritization) {
        this.name = name;
        this.prioritization = prioritization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getPrioritization() {
        return prioritization;
    }

    public void setPrioritization(byte prioritization) {
        this.prioritization = prioritization;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.prioritization;
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
        final AdministratorType other = (AdministratorType) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.prioritization != other.prioritization) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdministratorType{" + "name=" + name + ", prioritization=" + prioritization + '}';
    }
    
    
}

/*
 */
package hu.javagladiators.app.hero.model;

import java.util.Objects;

/**
 * @author krisztian
 */
public class AdministratorType {
    private byte prioritization;

    public AdministratorType() {
    }

    public AdministratorType(byte prioritization) {
        this.prioritization = prioritization;
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
        
        if (this.prioritization != other.prioritization) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdministratorType{ prioritization=" + prioritization + '}';
    }
    
    
}

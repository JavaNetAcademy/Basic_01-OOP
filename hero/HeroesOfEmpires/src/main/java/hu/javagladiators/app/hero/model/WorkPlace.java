/*
 */
package hu.javagladiators.app.hero.model;

import java.util.Date;

/**
 * @author krisztian
 */
public abstract class WorkPlace {
    protected static long idgenerator =0;
    protected long id;
    protected Date validityStart;
    protected Date validityEnd;
    protected Hero hero;
    protected AdministratorType type;

/*nem szálbiztos*/    
    public WorkPlace() {
        idgenerator++;
        id = idgenerator;
    }

    public WorkPlace(Date validityStart, Date validityEnd, Hero hero, AdministratorType type) {
        this();
        this.validityStart = validityStart;
        this.validityEnd = validityEnd;
        this.hero = hero;
        this.type = type;
    }

    public Date getValidityStart() {
        return validityStart;
    }

    public void setValidityStart(Date validityStart) {
        this.validityStart = validityStart;
    }

    public Date getValidityEnd() {
        return validityEnd;
    }

    public void setValidityEnd(Date validityEnd) {
        this.validityEnd = validityEnd;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public AdministratorType getType() {
        return type;
    }

    public void setType(AdministratorType type) {
        this.type = type;
    }
    
    public boolean isActive(Date pDate){
        return (pDate.after(getValidityStart()) && pDate.before(getValidityEnd()))
                || pDate.equals(getValidityEnd()) 
                || pDate.equals(getValidityStart());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final WorkPlace other = (WorkPlace) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}

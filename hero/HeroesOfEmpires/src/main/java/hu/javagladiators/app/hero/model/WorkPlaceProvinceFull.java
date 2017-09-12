/*
 */
package hu.javagladiators.app.hero.model;

/**
 * @author krisztian
 */
public class WorkPlaceProvinceFull extends WorkPlace{
    private Empire empire;
    private Province province;

    public Empire getEmpire() {
        return empire;
    }

    public void setEmpire(Empire empire) {
        this.empire = empire;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
    
    
}

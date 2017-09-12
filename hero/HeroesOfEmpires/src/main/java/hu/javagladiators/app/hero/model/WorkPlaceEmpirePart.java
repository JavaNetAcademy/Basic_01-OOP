/*
 */
package hu.javagladiators.app.hero.model;

import java.util.List;

/**
 * @author krisztian
 */
public class WorkPlaceEmpirePart extends WorkPlace{
    private Empire empire;
    private Province[] provinces= new Province[10];

    public Empire getEmpire() {
        return empire;
    }

    public void setEmpire(Empire empire) {
        this.empire = empire;
    }

    public Province[] getProvinces() {
        return provinces;
    }

    public void setProvinces(Province[] provinces) {
        this.provinces = provinces;
    }
    
}

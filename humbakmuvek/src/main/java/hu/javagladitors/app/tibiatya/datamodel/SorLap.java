package hu.javagladitors.app.tibiatya.datamodel;

import java.util.ArrayList;
import java.util.List;

public class SorLap 
{       
    private List<Ar> arak = new ArrayList();
    private List<Sor> sorok = new ArrayList();
    private List<Mennyiseg> mennyiseg = new ArrayList();
    
    
    public SorLap()
    {
    }

    public List<Ar> getArak() {
        return arak;
    }

    public void setArak(List<Ar> arak) {
        this.arak = arak;
    }

    public List<Sor> getSorok() {
        return sorok;
    }

    public void setSorok(List<Sor> sorok) {
        this.sorok = sorok;
    }

    public List<Mennyiseg> getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(List<Mennyiseg> mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
      
    
}

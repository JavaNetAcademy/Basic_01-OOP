package hu.javagladitors.app.tibiatya.datamodel;

import java.util.ArrayList;
import java.util.List;


public class PalinkaLap 
{        
    private List<Palinka> palinkak = new ArrayList();    
    private List<Mennyiseg> mennyiseg = new ArrayList();
    private List<Ar> arak = new ArrayList();
    
    public PalinkaLap()
    {
       palinkak.add(new Palinka("barack",0,38.6, "Tesco", "Fütyülős barack" ));
       palinkak.add(new Palinka("szilva",1,45.6, "Tesco","Házi" ));
       palinkak.add(new Palinka("csokis-mogyorós", 2,38.6, "Tesco","Fütyülős csokis" ));
       
       mennyiseg.add(new Mennyiseg(0,1000, "ml", "házi üveges"));
       mennyiseg.add(new Mennyiseg(1,2, "cl", "kisfeles"));
       mennyiseg.add(new Mennyiseg(2,4, "cl", "feles"));      
       
       arak.add(new Ar(palinkak.get(0), mennyiseg.get(0), 2800));
       arak.add(new Ar(palinkak.get(1), mennyiseg.get(1), 400));
       arak.add(new Ar(palinkak.get(2), mennyiseg.get(2), 650));
        
    }

    public List<Palinka> getPalinkak() {
        return palinkak;
    }

    public void setPalinkak(List<Palinka> palinkak) {
        this.palinkak = palinkak;
    }

    public List<Mennyiseg> getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(List<Mennyiseg> mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public List<Ar> getArak() {
        return arak;
    }

    public void setArak(List<Ar> arak) {
        this.arak = arak;
    }

    
}

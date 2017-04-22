package hu.javagladitors.app.tibiatya.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisztian
 */
public class ItalTipusLap {
    private String title ="";
    private List<? super AlkoholosItalok> italok = new ArrayList();    
    private List<Mennyiseg> mennyisegek = new ArrayList();
    private List<Ar> arak = new ArrayList();

    public ItalTipusLap() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<? super AlkoholosItalok> getItalok() {
        return italok;
    }

    public void setItalok(List<? super AlkoholosItalok> italok) {
        this.italok = italok;
    }

    public void addItal(AlkoholosItalok ital) {
        this.italok.add(ital);
    }

    public List<Mennyiseg> getMennyisegek() {
        return mennyisegek;
    }

    public void setMennyisegek(List<Mennyiseg> mennyisegek) {
        this.mennyisegek = mennyisegek;
    }

    public void addMennyiseg(Mennyiseg mennyiseg) {
        this.mennyisegek.add(mennyiseg);
    }

    
    public List<Ar> getArak() {
        return arak;
    }

    public void setArak(List<Ar> arak) {
        this.arak = arak;
    }
    
    public void addAr(Ar ar) {
        this.arak.add(ar);
    }
    
    
}

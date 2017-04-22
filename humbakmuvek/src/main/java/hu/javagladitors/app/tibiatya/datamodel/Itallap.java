/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.tibiatya.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P-011-15.hallgato
 */
public class Itallap 
{    
    private List<ItalTipusLap> italtipusok = new ArrayList<>();

    public List<ItalTipusLap> getItaltipusok() {
        return italtipusok;
    }

    public void setItaltipusok(List<ItalTipusLap> italtipusok) {
        this.italtipusok = italtipusok;
    }
    
    public void addItaltipus(ItalTipusLap italtipus) {
        this.italtipusok.add(italtipus);
    }
    
    
}














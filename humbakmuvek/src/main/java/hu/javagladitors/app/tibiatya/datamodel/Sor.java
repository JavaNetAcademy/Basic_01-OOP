/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.javagladitors.app.tibiatya.datamodel;

/**
 *
 * @author P-011-15.hallgato
 */
public class Sor extends AlkoholosItalok
{
    private String szine;  

    public Sor(String szine, long ID, double alkoholtartalom, String gyarto, String neve) {
        super(ID, alkoholtartalom, gyarto, neve);
        this.szine = szine;
    }

    public String getSzine() {
        return szine;
    }

    public void setSzine(String szine) {
        this.szine = szine;
    }
    

}

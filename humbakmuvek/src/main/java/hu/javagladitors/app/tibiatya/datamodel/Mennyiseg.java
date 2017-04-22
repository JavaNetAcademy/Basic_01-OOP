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
public class Mennyiseg 
{
    private long ID;
    private Integer mennyiseg;
    private String mertekegyseg;
    private String kiszereles;

    public Mennyiseg(long ID,Integer mennyiseg, String mertekegyseg, String kiszereles) {
        this.ID = ID;
        this.mennyiseg = mennyiseg;
        this.mertekegyseg = mertekegyseg;
        this.kiszereles = kiszereles;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Integer getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(Integer mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public String getMertekegyseg() {
        return mertekegyseg;
    }

    public void setMertekegyseg(String mertekegyseg) {
        this.mertekegyseg = mertekegyseg;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }
    
    
    
    
}

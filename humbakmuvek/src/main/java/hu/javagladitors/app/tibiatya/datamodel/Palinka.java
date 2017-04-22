package hu.javagladitors.app.tibiatya.datamodel;

public class Palinka extends AlkoholosItalok
{
    private String gyumolcs; 

    public Palinka(String gyumolcs, long ID, double alkoholtartalom, String gyarto, String neve) {
        super(ID, alkoholtartalom, gyarto, neve);
        this.gyumolcs = gyumolcs;
    }

    public String getGyumolcs() {
        return gyumolcs;
    }

    public void setGyumolcs(String gyumolcs) {
        this.gyumolcs = gyumolcs;
    }
    

}

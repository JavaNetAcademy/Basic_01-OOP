package hu.javagladitors.app.tibiatya.datamodel;

public class Bor extends AlkoholosItalok
{
    private String tipus;

    public Bor(String tipus, long ID, double alkoholtartalom, String gyarto, String neve) {
        super(ID, alkoholtartalom, gyarto, neve);
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }


}

package hu.javagladitors.app.tibiatya.datamodel;

public class AlkoholosItalok {

    protected long ID;
    protected double alkoholtartalom;
    private String gyarto;
    private String neve;

    public AlkoholosItalok(long ID, double alkoholtartalom, String gyarto, String neve) {
        this.ID = ID;
        this.alkoholtartalom = alkoholtartalom;
        this.gyarto = gyarto;
        this.neve = neve;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public double getAlkoholtartalom() {
        return alkoholtartalom;
    }

    public void setAlkoholtartalom(double alkoholtartalom) {
        this.alkoholtartalom = alkoholtartalom;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getNeve() {
        return neve;
    }

    public void setNeve(String neve) {
        this.neve = neve;
    }

    
}

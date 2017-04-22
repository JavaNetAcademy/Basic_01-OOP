package hu.javagladitors.app.tibiatya.datamodel;

public class Ar {
    private AlkoholosItalok ital;
    private Mennyiseg me;
    private long ar;
    
    public Ar(AlkoholosItalok ital, Mennyiseg me, long ar) {
        this.ital = ital;
        this.me = me;
        this.ar = ar;
    }
    
    public AlkoholosItalok getItal() {
        return ital;
    }

    public void setItal(AlkoholosItalok ital) {
        this.ital = ital;
    }

    public Mennyiseg getMe() {
        return me;
    }

    public void setMe(Mennyiseg me) {
        this.me = me;
    }

    public long getAr() {
        return ar;
    }

    public void setAr(long ar) {
        this.ar = ar;
    }

   
}

package hu.javagladitors.app.tibiatya.datamodel;

import java.util.ArrayList;
import java.util.List;

public class BorLap 
{
    private List<Bor> borok = new ArrayList();
    private List<Mennyiseg> mennyiseg = new ArrayList();
    private List<Ar> arak = new ArrayList();
    
    public BorLap()
    {}

    public List<Bor> getBorok() {
        return borok;
    }

    public void setBorok(List<Bor> borok) {
        this.borok = borok;
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
    
    public Ar getArByItalMennyiseg(Bor pBor, Mennyiseg pMe)  throws NullPointerException
    {
        for(Ar ar:arak)
            if( 
                    ar.getItal().equals(pBor) &&
                    ar.getMe().equals(pMe)
            )
                return ar;
        throw new NullPointerException();
    }
    
    public Bor getBor(long searchId) throws NullPointerException
    { 
        for(Bor bor : getBorok())
        {
             if(bor.getID() == searchId )
             {
                 return bor;
             }
        }        
        throw new NullPointerException();
    }
    
    public Mennyiseg getMennyisegById(long searchId) throws NullPointerException{
        
      for(Mennyiseg me : getMennyiseg())
      {
          if(me.getID() == searchId )
          {
              return me;
          }
      }
      throw new NullPointerException();
    }    
}

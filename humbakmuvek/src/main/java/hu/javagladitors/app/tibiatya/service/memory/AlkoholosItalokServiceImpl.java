package hu.javagladitors.app.tibiatya.service.memory;

import hu.javagladitors.app.tibiatya.datamodel.AlkoholosItalok;
import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import java.util.List;

/**
 * @author krisztian
 */
public class AlkoholosItalokServiceImpl {

    public Ar getAr(List<Ar> pSource, AlkoholosItalok pItal, Mennyiseg pMennyiseg) throws NullPointerException{
        for(Ar item:pSource)
            if(
                item.getItal().equals(pItal) &&
                item.getMe().equals(pMennyiseg)
            )
                return item;
        throw new NullPointerException();
    
    }
    
    public AlkoholosItalok getAlkoholosItalokById(List<AlkoholosItalok > pSource, long id) throws NullPointerException{
        for(AlkoholosItalok item:pSource)
            if(item.getID() == id)
                return item;
        throw new NullPointerException();
    }
    
    public Mennyiseg getMennyisegById(List<Mennyiseg> pSource,long id) throws NullPointerException{
        for(Mennyiseg item:pSource)
            if(item.getID() == id)
                return item;
        throw new NullPointerException();
    }
    
}

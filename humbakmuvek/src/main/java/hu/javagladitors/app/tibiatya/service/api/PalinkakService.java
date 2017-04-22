package hu.javagladitors.app.tibiatya.service.api;

import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import hu.javagladitors.app.tibiatya.datamodel.Palinka;

/**
 * @author krisztian
 */
public interface PalinkakService {
    
    public Ar getAr(Palinka pPalinka, Mennyiseg pMennyiseg) throws NullPointerException;
    public Palinka getPalinkaById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;
    
}

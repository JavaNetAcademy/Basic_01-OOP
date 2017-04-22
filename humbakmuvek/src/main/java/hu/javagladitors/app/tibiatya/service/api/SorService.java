package hu.javagladitors.app.tibiatya.service.api;

import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import hu.javagladitors.app.tibiatya.datamodel.Sor;

/**
 * @author krisztian
 */
public interface SorService {

    public Ar getAr(Sor pSor, Mennyiseg pMennyiseg) throws NullPointerException;
    public Sor getSorById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;

}

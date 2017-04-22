package hu.javagladitors.app.tibiatya.service.api;

import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;

public interface BorService {
    
    public Ar getAr(Bor pBor, Mennyiseg pMennyiseg) throws NullPointerException;
    public Bor getBorById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;
}

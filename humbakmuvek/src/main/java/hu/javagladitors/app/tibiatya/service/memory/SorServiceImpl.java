package hu.javagladitors.app.tibiatya.service.memory;

import hu.javagladitors.app.tibiatya.datamodel.AlkoholosItalok;
import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.ItalTipusLap;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import hu.javagladitors.app.tibiatya.datamodel.Sor;
import hu.javagladitors.app.tibiatya.service.api.ItallapService;
import hu.javagladitors.app.tibiatya.service.api.SorService;
import java.util.List;

/**
 * @author krisztian
 */
public class SorServiceImpl implements SorService{
    private static final String ITALTIPUS = "sörök";    
    AlkoholosItalokServiceImpl base = new AlkoholosItalokServiceImpl();
    ItallapService itallapService = new ItallapServiceImpl();

    @Override
    public Ar getAr(Sor pSor, Mennyiseg pMennyiseg) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return base.getAr(itl.getArak(), pSor, pMennyiseg);
    }

    @Override
    public Sor getSorById(long id) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return (Sor)base.getAlkoholosItalokById((List<AlkoholosItalok>)itl.getItalok(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return base.getMennyisegById(itl.getMennyisegek(), id);
    }
    
}

package hu.javagladitors.app.tibiatya.service.memory;

import hu.javagladitors.app.tibiatya.datamodel.AlkoholosItalok;
import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.ItalTipusLap;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import hu.javagladitors.app.tibiatya.service.api.BorService;
import hu.javagladitors.app.tibiatya.service.api.ItallapService;
import java.util.List;

/**
 * @author krisztian
 */
public class BorServiceImpl implements BorService{
    private static final String ITALTIPUS = "borok";    
    AlkoholosItalokServiceImpl base = new AlkoholosItalokServiceImpl();
    ItallapService itallapService = new ItallapServiceImpl();
            
    @Override
    public Ar getAr(Bor pBor, Mennyiseg pMennyiseg) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return base.getAr(itl.getArak(), pBor, pMennyiseg);
    }

    @Override
    public Bor getBorById(long id) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return (Bor)base.getAlkoholosItalokById((List<AlkoholosItalok>)itl.getItalok(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return base.getMennyisegById(itl.getMennyisegek(), id);
    }
    
}

package hu.javagladitors.app.tibiatya.service.memory;

import hu.javagladitors.app.tibiatya.datamodel.AlkoholosItalok;
import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.ItalTipusLap;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import hu.javagladitors.app.tibiatya.datamodel.Palinka;
import hu.javagladitors.app.tibiatya.datamodel.Sor;
import hu.javagladitors.app.tibiatya.service.api.ItallapService;
import hu.javagladitors.app.tibiatya.service.api.PalinkakService;
import java.util.List;

/**
 * @author krisztian
 */
public class PalinkaServiceImpl implements PalinkakService{
    private static final String ITALTIPUS = "pálinkák";    
    AlkoholosItalokServiceImpl base = new AlkoholosItalokServiceImpl();
    ItallapService itallapService = new ItallapServiceImpl();

    @Override
    public Ar getAr(Palinka pPalinka, Mennyiseg pMennyiseg) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return base.getAr(itl.getArak(), pPalinka, pMennyiseg);
    }

    @Override
    public Palinka getPalinkaById(long id) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return (Palinka)base.getAlkoholosItalokById((List<AlkoholosItalok>)itl.getItalok(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        ItalTipusLap itl = itallapService.getItalTipusLapByTitle(ITALTIPUS);
        return base.getMennyisegById(itl.getMennyisegek(), id);
    }
    
}

package hu.javagladitors.app.tibiatya.service.memory;

import hu.javagladitors.app.tibiatya.datamodel.ItalTipusLap;
import hu.javagladitors.app.tibiatya.service.api.ItallapService;

/**
 * @author krisztian
 */
public class ItallapServiceImpl implements ItallapService{

    @Override
    public ItalTipusLap getItalTipusLapByTitle(String pTitle) throws NullPointerException{
        for(ItalTipusLap item:DataStore.itallap.getItaltipusok())
            if(item.getTitle().equals(pTitle))
                return item;
        throw new NullPointerException();
    }
    
}

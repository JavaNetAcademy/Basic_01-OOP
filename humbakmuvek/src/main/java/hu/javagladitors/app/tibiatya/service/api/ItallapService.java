package hu.javagladitors.app.tibiatya.service.api;

import hu.javagladitors.app.tibiatya.datamodel.ItalTipusLap;

/**
 * @author krisztian
 */
public interface ItallapService {

    public ItalTipusLap getItalTipusLapByTitle(String pTitle) throws NullPointerException;
}

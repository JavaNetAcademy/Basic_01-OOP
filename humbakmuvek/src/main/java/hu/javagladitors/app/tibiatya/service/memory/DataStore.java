package hu.javagladitors.app.tibiatya.service.memory;

import hu.javagladitors.app.tibiatya.datamodel.AlkoholosItalok;
import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.BorLap;
import hu.javagladitors.app.tibiatya.datamodel.ItalTipusLap;
import hu.javagladitors.app.tibiatya.datamodel.Itallap;
import hu.javagladitors.app.tibiatya.datamodel.Mennyiseg;
import hu.javagladitors.app.tibiatya.datamodel.Palinka;
import hu.javagladitors.app.tibiatya.datamodel.Sor;
import java.util.List;

/**
 * @author krisztian
 */
public class DataStore {

    public static final Itallap itallap = new Itallap();

    static {
        ItalTipusLap itl = new ItalTipusLap();
        itl.setTitle("borok");
        
        List<? super AlkoholosItalok> borok = itl.getItalok();
        borok.add(new Bor("vörös", 0, 7.5, "Spar", "Dankó"));
        borok.add(new Bor("vörös", 1, 9.5, "Tesco", "Tokai"));
        borok.add(new Bor("vörös", 2, 6.6, "Atya", "Bormárka"));

        List<Mennyiseg> mennyiseg = itl.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 750, "ml", "üveges"));
        mennyiseg.add(new Mennyiseg(1, 1000, "ml", "kannás"));
        mennyiseg.add(new Mennyiseg(2, 750, "ml", "üveges"));

        List<Ar> arak = itl.getArak();
        arak.add(new Ar((Bor)borok.get(0), mennyiseg.get(0), 500));
        arak.add(new Ar((Bor)borok.get(1), mennyiseg.get(1), 1000));
        arak.add(new Ar((Bor)borok.get(2), mennyiseg.get(2), 300));

        itallap.addItaltipus(itl);
        
        
        itl = new ItalTipusLap();
        itl.setTitle("pálinkák");        
        List<? super AlkoholosItalok> palinkak = itl.getItalok();
        palinkak.add(new Palinka("barack", 0, 38.6, "Tesco", "Fütyülős barack"));
        palinkak.add(new Palinka("szilva", 1, 45.6, "Tesco", "Házi"));
        palinkak.add(new Palinka("csokis-mogyorós", 2, 38.6, "Tesco", "Fütyülős csokis"));

        mennyiseg = itl.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 1000, "ml", "házi üveges"));
        mennyiseg.add(new Mennyiseg(1, 2, "cl", "kisfeles"));
        mennyiseg.add(new Mennyiseg(2, 4, "cl", "feles"));

        arak = itl.getArak();
        arak.add(new Ar((Palinka)palinkak.get(0), mennyiseg.get(0), 2800));
        arak.add(new Ar((Palinka)palinkak.get(1), mennyiseg.get(1), 400));
        arak.add(new Ar((Palinka)palinkak.get(2), mennyiseg.get(2), 650));
        itallap.addItaltipus(itl);
        
        
        itl = new ItalTipusLap();
        itl.setTitle("sörök");        
        
        List<? super AlkoholosItalok> sorok = itl.getItalok();
        sorok.add(new Sor("világos", 0, 4.3, "Soproni sörgyár", "Heineken"));
        sorok.add(new Sor("világos", 1, 3.8, "Soproni sörgyár", "Gösser"));
        sorok.add(new Sor("világos", 2, 2.2, "Soproni sörgyár", "LighSör"));

        mennyiseg = itl.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 500, "ml", "korsó"));
        mennyiseg.add(new Mennyiseg(1, 300, "ml", "pohár"));
        mennyiseg.add(new Mennyiseg(2, 400, "ml", "dobozos"));

        arak = itl.getArak();
        arak.add(new Ar((Sor)sorok.get(0), mennyiseg.get(0), 400));
        arak.add(new Ar((Sor)sorok.get(1), mennyiseg.get(1), 300));
        arak.add(new Ar((Sor)sorok.get(2), mennyiseg.get(2), 290));
        itallap.addItaltipus(itl);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.uniduna.e8qumv.alkalmazas;

import hu.javagladitors.app.tibiatya.datamodel.Ar;
import hu.javagladitors.app.tibiatya.datamodel.Bor;
import hu.javagladitors.app.tibiatya.datamodel.Itallap;
import hu.javagladitors.app.tibiatya.service.api.BorService;
import hu.javagladitors.app.tibiatya.service.memory.BorServiceImpl;
import hu.javagladitors.app.tibiatya.service.memory.DataStore;


/**
 *
 * @author P-011-15.hallgato
 */
public class Kocsma {
    
   public static void main(String[] argvs)
   {    
     
       Bor bor = (Bor)DataStore.itallap.getItaltipusok().get(0).getItalok().get(0);
       System.out.println(bor.getNeve());
       
       BorService serviceBor = new BorServiceImpl();
       System.out.println(serviceBor.getBorById(1).getNeve());
   }    
}
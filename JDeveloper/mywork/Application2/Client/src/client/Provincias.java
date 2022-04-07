package client;

import java.util.ArrayList;
import java.util.List;

public class Provincias {
    
    List<Provincia> Provincias = new ArrayList<Provincia>();
    
    public Provincias() {
        super();        
    }
    
    public void setProvincias(List<Provincia> Provincias) {
        this.Provincias = Provincias;
    }
    
    public List<Provincia> getProvincias(){
        if (Provincias.size() == 0) {
               Provincias.add(new Provincia("CA","CAPITAL FEDERAL"));
               Provincias.add(new Provincia("BA","BUENOS AIRES"));
               Provincias.add(new Provincia("CO","CORRIENTES"));
           }
               return Provincias;        
    }
    
    public boolean addProvincia(Provincia provincia){
        return Provincias.add(provincia);
    }
}
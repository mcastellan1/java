package client;

public class Provincia {
    String Provincia_id;
    String Provincia_nombre;
    public Provincia(String Provincia_id, String Provincia_naombre) {
        super();
        this.Provincia_id = Provincia_id;
        this.Provincia_nombre = Provincia_nombre;  
    }

    public void setProvincia_id(String provincia_id) {
        this.Provincia_id = Provincia_id;
    }

    public String getProvincia_id() {
        return Provincia_id;
    }

    public void setProvincia_nombre(String Provincia_nombre) {
        this.Provincia_nombre = Provincia_nombre;
    }

    public String getProvincia_nombre() {
        return Provincia_nombre;
    }
}

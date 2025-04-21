
package modelo;


public class Sello {
    private int idSello;
    private String nombreSello;

    public Sello() {
        this.idSello = 0;
        this.nombreSello = "";
    }
    public Sello(int idSello, String nombreSello) {
        this.idSello = idSello;
        this.nombreSello = nombreSello;
    }

    public int getIdSello() {
        return idSello;
    }

    public void setIdSello(int idSello) {
        this.idSello = idSello;
    }

    public String getNombreSello() {
        return nombreSello;
    }

    public void setNombreSello(String nombreSello) {
        this.nombreSello = nombreSello;
    }
    
    
}

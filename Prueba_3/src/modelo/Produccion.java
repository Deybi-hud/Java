
package modelo;


public abstract class Produccion {
   private int idProduccion;
   public Sello sello;
   private String nombre;
   private String anioEstreno;
   private String formato;
   private int precio;

    public Produccion() {
        this.idProduccion = 0;
        this.sello = null;
        this.nombre = "";
        this.anioEstreno = "";
        this.formato = "";
        this.precio = 0;
    }

    public Produccion(int idProduccion, Sello sello, String nombre, String anioEstreno, String formato, int precio) {
        this.idProduccion = idProduccion;
        this.sello = sello;
        this.nombre = nombre;
        this.anioEstreno = anioEstreno;
        this.formato = formato;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(int idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Sello getSello() {
        return sello;
    }

    public void setSello(Sello sello) {
        this.sello = sello;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(String anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
   
}
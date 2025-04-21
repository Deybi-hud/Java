
package modelo;


public class Pelicula extends Produccion{
    private String duracion;
    private String clasificacion;

    public Pelicula() {
        this.duracion = "";
        this.clasificacion = "";
    }

    public Pelicula(String duracion, String clasificacion, int idProduccion, Sello sello, String nombre, String anioEstreno, String formato, int precio) {
        super(idProduccion, sello, nombre, anioEstreno, formato, precio);
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }
    
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    
    
}

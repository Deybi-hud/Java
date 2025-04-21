
package modelo;

public class Serie extends Produccion{
    private String temporada;
    private String capitulos;
    private String duracion;

    public Serie(String temporada, String capitulos, String duracion) {
        this.temporada = temporada;
        this.capitulos = capitulos;
        this.duracion = duracion;
    }

    public Serie(String temporada, String capitulos, String duracion, int idProduccion, Sello sello, String nombre, String anioEstreno, String formato, int precio) {
        super(idProduccion, sello, nombre, anioEstreno, formato, precio);
        this.temporada = temporada;
        this.capitulos = capitulos;
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(String capitulos) {
        this.capitulos = capitulos;
    }
    
    
    
}

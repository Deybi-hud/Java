
package modelo;

public class Cliente extends Persona{
    
    private double descuento;

    public Cliente(double descuento) {
        this.descuento = descuento;
    }

    public Cliente(double descuento, int idPersona, Cargo cargo, int rut, String digito, String nombre, String apellido, String direccion, int esCliente, boolean habilitado) {
        super(idPersona, cargo, rut, digito, nombre, apellido, direccion, esCliente, habilitado);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
    
}

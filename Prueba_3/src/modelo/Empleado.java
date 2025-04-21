
package modelo;


public class Empleado extends Persona{
    
    private int sueldo;

    public Empleado(int sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(int sueldo, int idPersona, Cargo cargo, int rut, String digito, String nombre, String apellido, String direccion, int esCliente, boolean habilitado) {
        super(idPersona, cargo, rut, digito, nombre, apellido, direccion, esCliente, habilitado);
        this.sueldo = sueldo;
    }


    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}

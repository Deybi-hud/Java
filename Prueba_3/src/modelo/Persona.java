
package modelo;


public abstract class Persona {
    private int idPersona;
    private Cargo cargo;
    private int rut;
    private String digito;
    private String nombre;
    private String apellido;
    private String direccion;
    private int esCliente;
    private boolean habilitado;

    public Persona() {
        this.idPersona = 0;
        this.cargo = null;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.esCliente = 0;
        this.habilitado = false;
    }

    public Persona(int idPersona, Cargo cargo, int rut, String digito, String nombre, String apellido, String direccion, int esCliente, boolean habilitado) {
        this.idPersona = idPersona;
        this.cargo = cargo;
        this.rut = rut;
        this.digito = digito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.esCliente = esCliente;
        this.habilitado = habilitado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEsCliente() {
        return esCliente;
    }

    public void setEsCliente(int esCliente) {
        this.esCliente = esCliente;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    



    
}

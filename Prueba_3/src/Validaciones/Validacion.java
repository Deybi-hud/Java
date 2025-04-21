
package Validaciones;


public class Validacion {
    public static boolean validarRut(String rut) {
        return rut.matches("\\d+");
    }

    public static boolean validarDigito(String digito) {
        return digito.matches("[0-9kK]");
    }

    public static boolean validarSueldo(double sueldo) {
        return sueldo >= 600000 && sueldo <= 1500000;
    }
}

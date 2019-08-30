public class Limpieza {

    private String nombre;
    private String apellido;
    private int sueldoMensual;

    public Limpieza(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = 45000;
    }


    public void getVajillaRota(Integer vajillaRota) {
        sueldoMensual = sueldoMensual - vajillaRota * 5;
    }

    public void getSueldoMensual() {
        System.out.println("Su sueldo de Limpieza es $" + sueldoMensual);
    }
}

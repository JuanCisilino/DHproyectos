public class Limpieza {

    private String nombre;
    private String apellido;
    private int sueldoMensual;
    private int vajillaRota;

    public Limpieza(String nombre, String apellido, int vajillaRota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = 10000;
        this.vajillaRota = vajillaRota;
    }


    public void getSueldoMensual() {
        System.out.println("\nSu sueldo mensual como Limpieza es de $" + sueldoMensual);
        sueldoMensual = sueldoMensual - vajillaRota*5;
        System.out.println("Luego de descontar los " + vajillaRota + " juegos a reponer. Su sueldo quedara en $" + sueldoMensual);
    }
}

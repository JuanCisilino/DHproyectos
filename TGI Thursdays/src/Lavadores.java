public class Lavadores {

    private String nombre;
    private String apellido;
    private int sueldoMensual;
    private int vajillaRota;

    public Lavadores(String nombre, String apellido, int vajillaRota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = 12000;
        this.vajillaRota = vajillaRota;
    }


    public void getSueldoMensual() {
        System.out.println("\nSu sueldo mensual como Lavador es de $" + sueldoMensual);
        sueldoMensual = sueldoMensual - vajillaRota * 5;
        System.out.println("Luego de descontar los " + vajillaRota + " juegos a reponer. Su sueldo quedara en $" + sueldoMensual);
    }
}

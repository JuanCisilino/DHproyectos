public abstract class Empleados {

    private String nombre;
    private String apellido;
    private Double sueldoMensual;
    private Integer vajillaRota;

    public Empleados(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoMensual = 45000.0;
        this.vajillaRota = vajillaRota;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void getSueldoMensual() {
        System.out.println("Tu sueldo es $" + sueldoMensual);
    }

    public void getVajillaRota(){

    }
}


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Vehiculo Golfito = new Vehiculo(250.00, 50.00, 23.5, "PPT325");
        Vehiculo Teresa = new Vehiculo(320.00, 60.00, 23.5, "AA2504OP");

        Carrera carrera = new Carrera();

        carrera.darDeAltaAuto(250.00, 50.00, 23.5, "PPT325");
        carrera.darDeAltaMoto(320.00, 60.00, 45.00, "AA2504OP");
        carrera.darDeAltaAuto(280.00, 50.00, 29.0, "DFR890");
        carrera.darDeAltaMoto(265.00, 48.00, 38.00, "REQW451");

        carrera.eliminarAuto(Golfito);
        carrera.eliminarMoto(Teresa);

        carrera.mostrarListaDeCorredores();



    }
}

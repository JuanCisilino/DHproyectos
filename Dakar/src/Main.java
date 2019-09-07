import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here


    Carrera demolitionDakar = new Carrera("DemolitionDakar", 60.0, 5000,4);

    demolitionDakar.darDeAltaMoto(230.00,6.0,45.00,"abc123");
    demolitionDakar.darDeAltaMoto(210.00,7.0,38.00,"def456");
    demolitionDakar.darDeAltaAuto(250.00,12.0,23.00,"ghi789");
    demolitionDakar.darDeAltaAuto(220.00,10.0,20.00,"jec919");
    demolitionDakar.darDeAltaMoto(260.00,6.0,40.00,"ups345");

    demolitionDakar.eliminarVehiculo("abc123");

    demolitionDakar.socorrerAuto("jec919");

    /* demolitionDakar.socorrerMoto("def456");

    demolitionDakar.socorrerMoto("jec919");*/

    demolitionDakar.darDeAltaMoto(260.00,6.0,40.00,"ups345");

    demolitionDakar.definirGanador();

    }
}

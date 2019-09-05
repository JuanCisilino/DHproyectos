import java.util.*;

public class Carrera implements SocorristaAuto, SocorristaMoto {

    Map<Double, String> mapaDeCorredores;
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Double ganador;
    private Double aceleracionDeCarrera;

    public Carrera() {
        this.mapaDeCorredores = new HashMap<>();
        this.distancia = distancia;
        this.aceleracionDeCarrera = aceleracionDeCarrera;
        this.ganador = 0.0;
        this.nombre = nombre;
        this.premioEnDolares = 5000.00;
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        aceleracionDeCarrera = velocidad*0.5/aceleracion/(anguloDeGiro*(1000-4*100));
        if (mapaDeCorredores.size() <= 5) {
            mapaDeCorredores.put(aceleracionDeCarrera, patente);
            System.out.println("Tu vehiculo patente " + patente + " ah sido agregado a la carrera");
        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        aceleracionDeCarrera = velocidad*0.5/aceleracion/(anguloDeGiro*(300-2*100));
        if (mapaDeCorredores.size() <= 5) {
            mapaDeCorredores.put(aceleracionDeCarrera, patente);
            System.out.println("Tu vehiculo patente " + patente + " ah sido agregado a la carrera");
        }
    }

    public void eliminarAuto(Vehiculo unVehiculo) {
        mapaDeCorredores.remove(unVehiculo);
        System.out.println("Tu vehiculo patente" + unVehiculo.getPatente() + "ah sido eliminado de la carrera");
        }

    public void eliminarMoto(Vehiculo unVehiculo) {
        mapaDeCorredores.remove(unVehiculo);
        System.out.println("Tu vehiculo patente" + unVehiculo.getPatente() + "ah sido eliminado de la carrera");
    }

    public void eliminarVehiculoConPatente(Vehiculo unaPatente) {
        eliminarMoto(unaPatente);
        eliminarAuto(unaPatente);
        System.out.println("Tu vehiculo patente" + unaPatente.getPatente()+ "ah sido eliminado de la carrera");;
    }

    public  void mostrarListaDeCorredores() {
        for (Double clave: mapaDeCorredores.keySet()) {
            System.out.println( mapaDeCorredores.get(clave));
        }
    }


    public void ganadorDeLaCarrera() {
        for (Double clave: mapaDeCorredores.keySet()) {
            if (clave > ganador) {
                ganador = clave;
            } else {
                System.out.println("\nEl ganador eeeessssss el vehiculo patenteeee >>  " + mapaDeCorredores.get(ganador));
            }
        }
    }



    public void socorrerAuto(String patente) {
        socorrerAuto(patente);
    }

    public void socorrerMoto(String patente) {
        socorrerMoto(patente);
    }

    @Override
    public void socorrerAuto(Vehiculo unAuto) {
        System.out.println("Socorriendo Auto " + unAuto.getPatente());
    }

    @Override
    public void socorrerMoto(Vehiculo unaMoto) {
        System.out.println("Socorriendo Moto " + unaMoto.getPatente());

    }

}
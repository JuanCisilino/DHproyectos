import java.util.*;

public class Carrera extends Vehiculo implements SocorristaAuto, SocorristaMoto {

    Set<Vehiculo> listaDeCorredores;
    List<String> listaDePatentes;
    Map<Double, String> mapaDeCorredores;
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer Auto;
    private Integer Moto;
    private String ganador;

    public Carrera() {
        super();
        this.mapaDeCorredores = new HashMap<>();
        this.listaDeCorredores = new HashSet<>();
        this.listaDePatentes = new ArrayList<>();
        this.distancia = distancia;
        this.ganador = ganador;
        this.nombre = nombre;
        this.Auto = 0;
        this.Moto = 0;
        this.premioEnDolares = 5000.00;
    }

    public void darDeAltaAuto(Vehiculo unVehiculo) {
        if (listaDeCorredores.size() > 5) {
            listaDeCorredores.add(unVehiculo);
            mapaDeCorredores.put(unVehiculo.getAceleracionDeCarreraAuto(), unVehiculo.getPatente());
            listaDePatentes.add(unVehiculo.getPatente());
            Auto++;
            System.out.println("Tu vehiculo patente" + unVehiculo.getPatente() + " ah sido agregado a la carrera");
        }
    }

    public void darDeAltaMoto(Vehiculo unVehiculo) {
        if (listaDeCorredores.size() > 5) {
            listaDeCorredores.add(unVehiculo);
            mapaDeCorredores.put(unVehiculo.getAceleracionDeCarreraMoto(), unVehiculo.getPatente());
            listaDePatentes.add(unVehiculo.getPatente());
            Moto++;
            System.out.println("Tu vehiculo patente" + unVehiculo.getPatente() + " ah sido agregado a la carrera");
        }
    }

    public void eliminarAuto(Vehiculo unVehiculo) {
        listaDeCorredores.remove(unVehiculo);
        listaDePatentes.remove(unVehiculo.getPatente());
        Auto--;
    }

    public void eliminarMoto(Vehiculo unVehiculo) {
        listaDeCorredores.remove(unVehiculo);
        listaDePatentes.remove(unVehiculo.getPatente());
        Moto--;
        System.out.println("La moto ah sido eliminada");
    }

    public void eliminarVehiculoConPatente(Vehiculo unaPatente) {
        listaDeCorredores.remove(unaPatente);
        listaDePatentes.remove(unaPatente);
    }

    public void recorrerlista(){
        for (Integer i = 0; i == listaDeCorredores.size(); i++) {
            
        }

    }

    public void ganadorDeLaCarrera() {


    }



    public void socorrerAuto(String patente) {
        socorrerAuto(getPatente());
    }

    public void socorrerMoto(String patente) {
        socorrerMoto(getPatente());
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
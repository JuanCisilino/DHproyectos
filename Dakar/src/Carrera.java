import java.util.*;

public abstract class Carrera {


    private List<Vehiculo> listaDeVehiculos;
    private Double distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(String nombre, Double distancia, Integer premioEnDolares, Integer cantidadDeVehiculosPermitidos) {
        this.listaDeVehiculos = new ArrayList<>();
        this.distancia = distancia;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.nombre = nombre;
        this.premioEnDolares = premioEnDolares;
    }

    private Boolean hayCupo() {
        return listaDeVehiculos.size() < cantidadDeVehiculosPermitidos;
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (hayCupo()) {
            listaDeVehiculos.add(new Auto(velocidad, aceleracion, anguloDeGiro, patente));
            System.out.println("Auto agregada correctamente!!");
        } else {
            System.out.println("No hay cupo!!");
        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
          if (hayCupo()) {
            listaDeVehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
            System.out.println("Moto agregada correctamente!!");
        } else {
            System.out.println("No hay cupo!!");
        }
    }

    public void eliminarVehiculo(Vehiculo unVehiculo) {
        if (listaDeVehiculos.remove(unVehiculo)) {
            System.out.println("Tu vehiculo patente" + unVehiculo.getPatente() + "ah sido eliminado de la carrera");
        } else {
            System.out.println("No se pudo eliminar el vehiculo");
        }
    }

    private Vehiculo buscarVehiculoPorPatente(String patente){
        Vehiculo vehiculoBuscado = null;
        for (Vehiculo vehiculo:listaDeVehiculos) {
            if (vehiculo.getPatente().equals(patente)){
                vehiculoBuscado = vehiculo;
            }
        }
        return vehiculoBuscado;
    }

    public void eliminarVehiculo(String unaPatente) {

        Vehiculo vehiculoAEliminar = buscarVehiculoPorPatente(unaPatente);

            eliminarVehiculo(vehiculoAEliminar);
    }

    public Vehiculo definirGanador(){

        Vehiculo vehiculoGanador = listaDeVehiculos.get(0);

        for (Vehiculo vehiculo: listaDeVehiculos) {
            if (vehiculo.calcularValor() > vehiculoGanador.calcularValor()){
                vehiculoGanador = vehiculo;
            }
        }
        return vehiculoGanador;
    }

    public void socorrerAuto(String patente){
        try{
            Auto vehiculoASocorrer = (Auto) buscarVehiculoPorPatente(patente);
            socorristaAuto.socorrer(vehiculoASocorrer);

        } catch (ClassCastException e) {
            System.out.println("Lo que estas intentando socorrer no es un Auto!!");
        }

    }

    public void socorrerMoto(String patente){
        try{
            Moto vehiculoASocorrer = (Moto) buscarVehiculoPorPatente(patente);
            socorristaMoto.socorrer(vehiculoASocorrer);

        } catch (ClassCastException e) {
            System.out.println("Lo que estas intentando socorrer no es una Moto!!");
        }

    }

}


public class Vehiculo {

    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Double peso;
    private Integer cantidadDeRuedas;



    public Vehiculo(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente, Double peso, Integer cantidadDeRuedas){
        this.aceleracion = aceleracion;
        this.velocidad = velocidad;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.cantidadDeRuedas = cantidadDeRuedas;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo otroVehiculo = (Vehiculo) o;
        return otroVehiculo.patente.equals(this.patente);
    }

    @Override
    public int hashCode() {
        return patente.hashCode();
    }


    public String getPatente() {
        return patente;
    }
    public Double calcularValor(){
        return velocidad * (aceleracion/2) / (anguloDeGiro*(peso - cantidadDeRuedas * 100));
    }

}

public class Vehiculo {

    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;



    public Vehiculo(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente){
        this.aceleracion = aceleracion;
        this.velocidad = velocidad;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        }



    public Double getVelocidad() {
        return velocidad;
    }

    public Double getAceleracion() {
        return aceleracion;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPatente() {
        return patente;
    }

}

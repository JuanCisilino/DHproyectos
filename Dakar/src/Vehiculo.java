public class Vehiculo extends AutoyMoto  {

    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Double aceleracionDeCarreraMoto;
    private Double aceleracionDeCarreraAuto;

    public Vehiculo(){
        this.aceleracion = aceleracion;
        this.velocidad = velocidad;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.aceleracionDeCarreraAuto = velocidad*0.5/aceleracion/(anguloDeGiro*(getPesoAuto()-getRuedasAuto()*100));
        this.aceleracionDeCarreraMoto = velocidad*0.5/aceleracion/(anguloDeGiro*(getPesoMoto()-getRuedasMoto()*100));
        }

    public Double getAceleracionDeCarreraMoto() {
        return aceleracionDeCarreraMoto;
    }

    public Double getAceleracionDeCarreraAuto() {
        return aceleracionDeCarreraAuto;
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

import java.util.List;

public class Gato extends Raton {

    private String nombre;
    private Double energia;
    private Double velocidad;

    public Gato(String nombre) {
        this.nombre = nombre;
        this.energia = 0.0;
        this.velocidad = 5.0;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getEnergia() {
        return energia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void comerRaton(Raton unRaton){
        energia = energia + unRaton.getPeso();
        System.out.println("Me comi un raton y mi nueva energia es " + energia);
    }

    public void comerRaton(List<Raton> ratones){
        for (Raton unRaton : ratones) {
            comerRaton(unRaton);
        }
    }

    public Double correr(Integer cantidadDeMetros){
        energia = (0.5 * cantidadDeMetros) - energia ;
        return velocidad / cantidadDeMetros;
    }

    public Boolean meConvieneComerA(Raton unRaton, Integer distancia){

        return unRaton.getPeso() >= correr(distancia) ;
    }



    }



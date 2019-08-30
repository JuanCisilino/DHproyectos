import java.util.List;

public class Gato {

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

    private Double energiaConsumida(Integer metros){
        return 0.5*metros;
    }

    public Double correr(Integer metros){
        energia = energia - energiaConsumida(metros) ;
        return metros/velocidad;
    }

    public Boolean meConvieneComerA(Raton unRaton, Integer distancia){

        return unRaton.getPeso() > energiaConsumida(distancia) ;
    }



    }



public class Coca {

    private Integer tamano;
    private Double precio;

    public Coca(Integer tamano, Double precio){
        this.precio = precio;
        this.tamano = tamano;
    }

    public boolean equals(Object object) {
        Coca unaCoca = (Coca) object;
        if(this.tamano.equals(unaCoca.tamano)&& this.precio.equals(unaCoca.precio)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return false;
    }




}

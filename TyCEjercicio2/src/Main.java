import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> animales = new ArrayList<>();

        animales.add("Pato");
        animales.add("Perro");
        animales.add("Gato");

        try {
            System.out.println(animales.get(3));
        }catch (IndexOutOfBoundsException e){
           e.printStackTrace();
        }


    }
}

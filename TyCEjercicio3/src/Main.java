import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> animales = new ArrayList<>();

        try {
            animales.add("Perro");
            animales.add("Gato");
            animales.add("Pato");
        }catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(animales.get(5));
        }catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }



    }
}

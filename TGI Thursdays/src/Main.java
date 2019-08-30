public class Main {

    public static void main(String[] args) {
	// write your code here

        Limpieza juan = new Limpieza("Juan", "Cisilino");
        Lavadores pat = new Lavadores("Pat", "Ugarte");

        juan.getVajillaRota(10);

        pat.getVajillaRota(5);

        juan.getSueldoMensual();

        pat.getSueldoMensual();
    }

}

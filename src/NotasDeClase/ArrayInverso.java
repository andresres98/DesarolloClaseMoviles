package NotasDeClase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayInverso {
    public static void main(String[] args) {
        String[] productos = {"MacBook Pro", "Samsung Galaxy", "Asus Vivobook", "Kingstone",
                "LG Tv plus", "Tostadora Kalley", "Air Fryer"};
        int total = productos.length;
        Arrays.sort(productos);
        System.out.println("Con for ==========");
        for (int i = 0; i < total; i++) {
            System.out.println("El producto en la posicion " + i + " es " + productos[i]);
        }
        // Invertido
        int total2 = total / 2;
        for (int i = 0; i < total2; i++) {
            String actual = productos[i];
            String inverso = productos[total - i - 1];
            productos[i] = inverso;
            productos[total - i - 1] = actual;
        }
        System.out.println("======================================================");
        for (int i = 0; i < total; i++) {
            System.out.println("El producto en la posicion " + i + " es " + productos[i]);
        }
        //Ahora con Collections methods
        Collections.reverse(Arrays.asList(productos));
        System.out.println("=============================");
        for (int i = 0; i < total; i++) {
            System.out.println("El producto en la posicion " + i + " es " + productos[i]);
        }
        String num = "4567";
        int numConve = Integer.parseInt(num);
    }
}

package Ejercicios;
import java.util.Scanner;
import java.util.ArrayList;

public class EjercicioDeClase {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> nombres = new ArrayList<String>();
    public static ArrayList<Integer> edades = new ArrayList<Integer>();
    public static ArrayList<String> correos = new ArrayList<String>();
    public static boolean flag = false;
    public static void main(String[] args) {
        System.out.println("Desea Iniciar el programa. Responsa 'Si' o 'No' =>");
        String respuestaInicio = sc.next();
        if (respuestaInicio.equalsIgnoreCase("si")){

        } else{
            System.out.println("Ha elegido no iniciar");
        }

    }
    public static void menu(){
        do{
            System.out.println("Elija una opcion => \n1. Agregar Datos \n 2.Imprimir los datos \n3.Salir");
            int respuestaOpcion = sc.nextInt();
            switch (respuestaOpcion){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    flag = true;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (flag==false);
    }
}

package Ejercicios;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
public class Balance {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Double> ingresos = new ArrayList<Double>();
    static ArrayList<Double> egresos = new ArrayList<Double>();
    static double BALANCETOTAL;

    static boolean FLAG = true;


    public static void main(String[] args) {
        do {    
            Menu();
            System.out.println("Desea hacer otra vuelta");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("si")){
                continue;
            } else {
                FLAG = false;
            }
        } while (FLAG==true);
        
        
    }
    
    static void Menu(){
        System.out.println("Bienvenido a su bitacora de gastos \nQue desea hacer \n1. Reportar un ingreso \n2. Reportar un gasto \n" +
                "3. Ver su balance");
        int respuestaMenu = sc.nextInt();
        switch (respuestaMenu){
            case 1:
                ReportarIngreso();
                for (Double x: ingresos){
                    System.out.println("x = " + x);
                }
                break;
            case 2:
                ReportarEgreso();
                for(Double y: egresos){
                    System.out.println("y = " + y);
                }
                break;
            case 3:
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
    static void ReportarIngreso(){
        System.out.println("De cuanto fue su ingreso");
        double reporteIngreso = sc.nextDouble();
        ingresos.add(reporteIngreso);
    }
    static void ReportarEgreso() {
        System.out.println("De cuanto fue su egreso");
        double reporteEgreso = sc.nextDouble();
        ingresos.add(reporteEgreso);
    }
}

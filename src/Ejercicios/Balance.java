package Ejercicios;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
public class Balance {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Double> ingresos = new ArrayList<Double>();
    static ArrayList<Double> egresos = new ArrayList<Double>();
    static double BALANCETOTAL = 0;
    static double  resultadoSumaEgresos = 0;
    static double resultadoSumaIngresos=0;

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
                resultadoSumaIngresos = SumarArray(ingresos);
                System.out.println("resultadoSumaIngresos = " + resultadoSumaIngresos);
                break;
            case 2:
                ReportarEgreso();
                for(Double y: egresos){
                    System.out.println("y = " + y);
                }
                resultadoSumaEgresos = SumarArray(egresos);
                System.out.println("resultadoSumaEgresos = " + resultadoSumaEgresos);
                break;
            case 3:
                BALANCETOTAL= resultadoSumaIngresos - resultadoSumaEgresos;
                System.out.println("Su balance en este momento es de => " + BALANCETOTAL);
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
        egresos.add(reporteEgreso);
    }
    static double SumarArray(ArrayList<Double> listaSuma){
        double resultadoSuma =0;
        for(int i=0; i<listaSuma.size(); i++){
            resultadoSuma+=listaSuma.get(i);
        }
        return resultadoSuma;
    }
}

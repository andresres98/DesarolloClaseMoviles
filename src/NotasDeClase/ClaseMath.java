package NotasDeClase;

public class ClaseMath {
    public static void main(String[] args) {
        int valorAbsoluto = Math.abs(-67);
        System.out.println("valorAbsoluto = " + valorAbsoluto);
        double max = Math.max(4.567, 7.98);
        System.out.println("max = " + max);
        double min = Math.min(4.567, 7.98);
        System.out.println("min = " + min);
        
        double techo = Math.ceil(4.567);
        System.out.println("techo = " + techo);
        double piso = Math.floor(4.567);
        System.out.println("piso = " + piso);
        
        long numeroAproximado = Math.round(6.5);
        System.out.println("numeroAproximado = " + numeroAproximado);
        numeroAproximado = Math.round(6.4);
        System.out.println("numeroAproximado = " + numeroAproximado);
        
    }
}

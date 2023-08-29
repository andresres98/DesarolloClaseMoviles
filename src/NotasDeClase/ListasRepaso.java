package NotasDeClase;
import java.util.ArrayList;
import java.util.Scanner;
public class ListasRepaso {
    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> usuario= new ArrayList<String>();
        String id = "1";
        usuario.add(id); //Metodo que agrega elementos a la Array List
        String nombre= "Pepita";
        usuario.add(nombre);
        String correo= "pepita@mail.com";
        usuario.add(correo);
        String password = "1234";
        usuario.add(password);
        System.out.println("El tamaño de la lista es " + usuario.size());
        //Actualizar un elemento
        usuario.set(3, "xbz123");
        //eliminar
        usuario.remove(2);
        //Buscar elementos de la lista
        int encontrado = usuario.indexOf("Pepita");
        System.out.println("encontrado = " + encontrado);
        System.out.println(usuario.isEmpty());

        for(int i =0; i<usuario.size();i++){
            System.out.println("El dato #"+ i +" es "+ usuario.get(i));
        }
        ArrayList<String> librosFavoritos = new ArrayList<String>();
        int i= 0;
        while(i<10){
            System.out.println("Ingrese el libro #" + i);
            String libro= sc.nextLine();
            librosFavoritos.add(libro);
            i++;
        }
        for(String lib: librosFavoritos){
            System.out.println("lib = " + lib);
        }


    }



}

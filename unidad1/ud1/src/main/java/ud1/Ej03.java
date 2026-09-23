package main.java.ud1;
 
import java.io.File;
import java.util.Scanner;
 
public class Ej03 {
 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 
        System.out.print("Introduce la ruta del directorio raíz: ");
        String ruta = teclado.nextLine();
 
        File raiz = new File(ruta);
 
        if (!raiz.exists() || !raiz.isDirectory()) {
            System.out.println("La ruta indicada no es un directorio válido.");
        } else {
            listar(raiz, 0);
        }
 
        teclado.close();
    }
 
    public static void listar(File directorio, int nivel) {
        String[] contenido = directorio.list();
        

        if (contenido == null) {
            return;
        }
 
        for (String nombre : contenido) {
            File actual = new File(directorio, nombre);
 
            for (int i = 0; i < nivel; i++) {
                System.out.print("\t");
            }
            System.out.println(actual.getName());
 
            if (actual.isDirectory()) {
                listar(actual, nivel + 1);
            }
        }

        
    }
}
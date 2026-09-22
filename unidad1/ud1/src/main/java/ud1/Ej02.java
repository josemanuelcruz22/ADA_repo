package ud1;
import java.io.File;

public class Ej02 {
    public static void main(String[] args){
        File raiz = new File("/home/alumnadotarde/Escritorio/d");
        listar(raiz, 0);
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
    }}
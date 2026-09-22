package ud1;
 
import java.io.File;
import java.io.IOException;
 
public class Ej01 {
    public static void main(String[] args) throws IOException {
 
        // Carpeta raíz d
        File d = new File("/home/alumnadotarde/Escritorio/d");
        d.mkdir();
 
        // d1 y sus ficheros
        File d1 = new File(d, "d1");
        d1.mkdir();
        File f11 = new File(d1, "f11");
        f11.createNewFile();
        File f12 = new File(d1, "f12");
        f12.createNewFile();
 
        // d2 y su contenido
        File d2 = new File(d, "d2");
        d2.mkdir();
 
        File d21 = new File(d2, "d21");
        d21.mkdir();
 
        File f21 = new File(d2, "f21");
        f21.createNewFile();
 
        File d22 = new File(d2, "d22");
        d22.mkdir();
        File f222 = new File(d22, "f222");
        f222.createNewFile();
 
        // d3 y su subcarpeta
        File d3 = new File(d, "d3");
        d3.mkdir();
        File d31 = new File(d3, "d31");
        d31.mkdir();
 
        System.out.println("Estructura creada.");
    }
}
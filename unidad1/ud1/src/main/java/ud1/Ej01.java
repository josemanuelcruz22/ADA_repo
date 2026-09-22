package ud1;
import java.io.File;

public class Ej01 {
    

    public static void main(String[] args) {
        File d = new File("/home/alumnadotarde/Escritorio/d");
        boolean creado = d.mkdir();
        System.out.println("¿Se creó d? " + creado);
    }
}


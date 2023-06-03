
package test;



import java.io.*;
import static manejoarhivos.ManejoArhivos.*;

/**
 *
 * @author JOSE
 */
public class TestManejoArchivos {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nombreArchivo = "Prueba txt";
        //crearArchivo(nombreArchivo);
       // esribirArchivo(nombreArchivo,"Hola desde Java");
         //anexarArchivo(nombreArchivo,"adios");
         leerArchivo(nombreArchivo);
    }
}

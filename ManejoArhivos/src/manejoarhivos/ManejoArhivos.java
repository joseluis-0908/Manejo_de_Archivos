/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarhivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOSE
 */
public class ManejoArhivos {

    public static void crearArchivo(String nombreArchivo) throws FileNotFoundException {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);//abrimos el archivo
            salida.close();//cerramo el flujo que se abrio para que finalmente se guarde en memoria
            System.out.println(" Se ha creado el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);//abrimos el archivo
            salida.println(contenido);
            salida.close();//cerramo el flujo que se abrio para que finalmente se guarde en memoria
            System.out.println(" Se ha escrito el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }
    public static void anexarArchivo(String nombreArchivo, String contenido) throws IOException{
       File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));//abrimos el archivo
            salida.println(contenido);
            salida.close();//cerramo el flujo que se abrio para que finalmente se guarde en memoria
            System.out.println(" Se ha anexado el archivo ");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }  
        
    }
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura!=null){
                System.out.println(" Lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
           // Logger.getLogger(ManejoArhivos.class.getName()).log(Level.SEVERE, null, ex);//remlazo por ex.printStackTrace(System.out);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Excepciones.*;
import Modelo.Computador;
import Persistencia.*;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public class Principal {

    public static void main(String[] args) {

        Computador pc1 = new Computador(123, "HP", 2000);
        Computador pc2 = new Computador(345, "Asus", 4000);
        Computador pc3 = new Computador(567, "Lenovo", 6000);

        IComputadorDao archivo = new ImpArchivoTexto();

        try {
            archivo.registrar(pc1);
            archivo.registrar(pc2);
            archivo.registrar(pc3);
            System.out.println("Caso 1: Registro de datos en archivo");
        } catch (ExcepcionEscritura e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 2: Lectura de archivo\n");
        try {
            List<Computador> lista = archivo.leer();
            for (Computador c : lista) {
                System.out.println(c);
            }
        } catch (ExcepcionLectura e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 3: Busqueda por serial 123\n");
        try {
            Computador busqueda = archivo.buscar(new Computador(123));
            if(busqueda!=null){
                System.out.println("Resultado: Encontrado");
                System.out.println(busqueda);
            }
            else{
                System.out.println("Resultado: No encontrado");
            }
        } catch (ExcepcionLectura e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 4: Eliminacion por serial 123\n");
        try {
            Computador eliminado = archivo.eliminar(new Computador(123));
            if(eliminado!=null){
                System.out.println("Resultado: Eliminado");
                System.out.println(eliminado);
            }
            else{
                System.out.println("Resultado: No encontrado");
            }
        } catch (ExcepcionLectura e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 2: Lectura de archivo\n");
        try {
            List<Computador> lista = archivo.leer();
            for (Computador c : lista) {
                System.out.println(c);
            }
        } catch (ExcepcionLectura e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}

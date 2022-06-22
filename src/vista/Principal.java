/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import Excepciones.*;
import Modelo.Computador;
import Modelo.ListaComputador;
import Persistencia.*;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public class Principal {

    public static void main(String[] args) {
       
        // new GuiRegistro(null, false);
        new GuiInicio();
        //new GuiPrincipal(null, false);
        //new GuiConsulta(null, false);
        /*
        Computador pc1 = new Computador(123, "HP", 2000);
        Computador pc2 = new Computador(345, "Asus", 4000);
        Computador pc3 = new Computador(567, "Lenovo", 6000);

        ListaComputador catalogo = new ListaComputador();

        try {
            catalogo.registrar(pc1);
            catalogo.registrar(pc2);
            catalogo.registrar(pc3);
            System.out.println("Caso 1: Registro de datos en archivo");
        } catch (ExcepcionArchivo e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 2: Lectura de archivo\n");
        try {
            List<Computador> lista = catalogo.leer();
            for (Computador c : lista) {
                System.out.println(c);
            }
        } catch (ExcepcionArchivo e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 3: Busqueda por serial 123\n");
        try {
            Computador busqueda = catalogo.buscar(new Computador(123));
            if(busqueda!=null){
                System.out.println("Resultado: Encontrado");
                System.out.println(busqueda);
            }
            else{
                System.out.println("Resultado: No encontrado");
            }
        } catch (ExcepcionArchivo e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 4: Eliminacion por serial 123\n");
        try {
            Computador eliminado = catalogo.eliminar(new Computador(123));
            if(eliminado!=null){
                System.out.println("Resultado: Eliminado");
                System.out.println(eliminado);
            }
            else{
                System.out.println("Resultado: No encontrado");
            }
        } catch (ExcepcionArchivo e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
        
        System.out.println("-------------------------------------");
        
        System.out.println("Caso 2: Lectura de archivo\n");
        try {
            List<Computador> lista = catalogo.leer();
            for (Computador c : lista) {
                System.out.println(c);
            }
        } catch (ExcepcionArchivo e) {
            System.out.println("Excepcion: " + e.getMessage());
        }*/
    }
}

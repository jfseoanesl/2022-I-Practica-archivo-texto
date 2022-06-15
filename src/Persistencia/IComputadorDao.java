/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Excepciones.*;
import Modelo.Computador;
import java.util.List;

/**
 *
 * @author Jairo F
 */
public interface IComputadorDao {
    
    void registrar(Computador c) throws ExcepcionEscritura;
    List<Computador> leer() throws ExcepcionLectura;
    Computador buscar(Computador c) throws ExcepcionLectura;
    Computador eliminar(Computador c)throws ExcepcionLectura;    
    
}

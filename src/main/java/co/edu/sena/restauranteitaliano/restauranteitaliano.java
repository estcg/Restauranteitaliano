/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.sena.restauranteitaliano;

import co.edu.sena.restauranteitaliano.modelo.Vista.ManejadorPantallas;
import co.edu.sena.restauranteitaliano.modelo.controlador.Conexion;

/**
 *
 * @author MALAGA
 */
public class restauranteitaliano {

    public static void main(String[] args) {
        Conexion.conectar();
        
        
        
        ManejadorPantallas.abrirPantallaPlatos();
        
        
        
    }
}

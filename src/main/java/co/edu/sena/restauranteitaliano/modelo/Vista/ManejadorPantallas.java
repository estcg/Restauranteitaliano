/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.restauranteitaliano.modelo.Vista;

/**
 *
 * @author MALAGA
 */
public class ManejadorPantallas {
    
    
    public static VPlatos pantallaPlatos;
    public static void abrirPantallaPlatos(){
    
        pantallaPlatos = new VPlatos();
        pantallaPlatos.setVisible(true);
        pantallaPlatos.setLocationRelativeTo(null);
    
    }
    
    
    public static void cerrarPantallaPlatos(){
    pantallaPlatos.setVisible(false);
    pantallaPlatos=null;
    
    
    
    }
    
    
}

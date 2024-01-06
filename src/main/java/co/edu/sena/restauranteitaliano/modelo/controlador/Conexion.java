/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.restauranteitaliano.modelo.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MALAGA
 */
public class Conexion {
    
    private static Connection conect;

    public static void conectar(){
        

     String url = "jdbc:mysql://localhost:3306/mirestaurante?serverTimeZone=UTC";
     String usr = "root";
     String ctr = "admin";

        try {
            conect = DriverManager.getConnection(url,usr,ctr);
            JOptionPane.showMessageDialog(null, "SI CONECTO");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "NO CONECTO");
        }
     
     
}

    public static Connection getConect() {
        return conect;
    }
    
    
    
    
    
}

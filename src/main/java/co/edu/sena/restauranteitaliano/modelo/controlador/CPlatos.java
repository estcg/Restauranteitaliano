/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.restauranteitaliano.modelo.controlador;

import co.edu.sena.restauranteitaliano.modelo.Platos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MALAGA
 */
public class CPlatos {
    
      public void registarPlatos(Platos e) {

        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("insert into platos values ('" + e.getCodigo() + "','" + e.getNombre() + "','" + e.getPrecio());
            JOptionPane.showMessageDialog(null, "Registrado");

        } catch (SQLException ex) {
            Logger.getLogger(CPlatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet consultarPlatos() {
        ResultSet rs = null;
        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from Platos");
           

        } catch (SQLException ex) {
            Logger.getLogger(CPlatos.class.getName()).log(Level.SEVERE, null, ex);
           
        }

        return rs;
    }

    public ResultSet consultarPlatosId(int codigo) {
        ResultSet rs = null;

        try {
            Statement st = Conexion.getConect().createStatement();
            rs = st.executeQuery("select * from Platos where cod_plato = '" + codigo + "'");

        } catch (SQLException ex) {
            Logger.getLogger(CPlatos.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rs;

    }

    public void modificarPlatos(Platos e) {
        
          try {
              Statement st =Conexion.getConect().createStatement();
              st.execute("update Platos set nom_plato= '"+e.getNombre()+"',prec_plato='"+e.getPrecio()+"' where cod_plato='"+e.getCodigo()+"'  ");
          } catch (SQLException ex) {
              Logger.getLogger(CPlatos.class.getName()).log(Level.SEVERE, null, ex);
          }
        
       
    }

    public void eliminarPlatos(int codigo) {

        try {
            Statement st = Conexion.getConect().createStatement();
            st.execute("delete from Platos where cod_plato = '" + codigo + "'");
            JOptionPane.showMessageDialog(null, "Eliminado");

        } catch (SQLException ex) {
            Logger.getLogger(CPlatos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Problemas, No Elimino");
        }

    }

    
    public void pintarTabla(JTable  tabla, ResultSet rs){
    
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        
      
        
          try {
              
              while (rs.next()) {
                  
                  String [] fila= {rs.getString("cod_plato"),rs.getString("nom_plato"),rs.getString("prec_plato")};
                  modelo.addRow(fila);
              } 
          
              tabla.setModel(modelo);
          
          } catch (SQLException ex) {
              Logger.getLogger(CPlatos.class.getName()).log(Level.SEVERE, null, ex);
          }
    
    }
    
    
    
    
}

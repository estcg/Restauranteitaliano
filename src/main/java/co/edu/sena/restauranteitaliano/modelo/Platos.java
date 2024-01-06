/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.restauranteitaliano.modelo;

/**
 *
 * @author MALAGA
 */
public class Platos {
    private int codigo;
    private String nombre;
    private float precio;

    public Platos (int codigo, String nombre , float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Platos {" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
    
}

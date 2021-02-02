/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioexamen;

/**
 *
 * @author raulx
 */
public class Producto {
    private String Nombre;
    private String Tipo;
    private String Categoría;
    private boolean marca;
    public Producto(String Nombre,String Tipo,String Categoría){
        this.Nombre=Nombre;
        this.Tipo=Tipo;
        this.Categoría=this.Categoría;
        this.marca=false;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getCategoría(){
        return Categoría;
    }
    
    public void setMarca(boolean m){
    marca=m;
    }
    
    public boolean getMarca(){
        return marca;
    }
}

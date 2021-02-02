/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioexamen;

import java.util.Comparator;

/**
 *
 * @author raulx
 */
public abstract class Lista {
    
   
    public abstract boolean añadeProducto(Producto e);

    public abstract boolean quitaProducto(Producto e);
    
        public static class ComparadorNombre implements Comparator<Producto> {  
        @Override
        public int compare(Producto p1, Producto p2){
            
              return p1.getNombre().compareTo(p2.getNombre());
     
        }
    }
        
        public static class ComparadorCategoría implements Comparator<Producto> {  
        @Override
        public int compare(Producto p1, Producto p2){
            
            
           
                return p1.getCategoría().compareTo(p2.getCategoría());
         
        }
    }
}

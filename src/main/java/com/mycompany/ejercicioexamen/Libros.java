/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioexamen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raulx
 */
public class Libros extends Lista{
        private List<Producto> lista =new ArrayList<Producto>();
        private String Nombre;
        public Libros(String Nombre){
            this.Nombre=Nombre;
        }
        
    /**
     *
     * @param e
     * @return
     */
    @Override
        public boolean añadeProducto(Producto e){
        if(this.lista.contains(e)){
            return false;
        }else if(e.getTipo().equals("LibrosItem")){
            this.lista.add(e);
            return true;
        }
            return false;
        }
        
        @Override
        public boolean quitaProducto(Producto e){
            if(this.lista.contains(e)){
                this.lista.remove(e);
                return true;
            }else{
                return false;
            }
        }
}

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
public class Main {
    //Algunos casos de prueba
     public static void main(String[] args) {
        Supermercado p= new Supermercado("La compra semanal");
        Producto a=new Producto("Chocapic","SupermercadoItem","Cereales");
        if(p.añadeProducto(a)){
            System.out.print("Añade funciona\n");
        }else{
            System.out.print("Añade no funciona\n");
        }
        
        if(a.getMarca()){
            System.out.print("el objeto está marcado\n");
        }else{
            System.out.print("el objeto no está marcado\n");
        }
        
        a.setMarca(true);
        
        if(a.getMarca()){
            System.out.print("el objeto está marcado\n");
        }else{
            System.out.print("el objeto no está marcado\n");
        }
        
        if(p.quitaProducto(a)){
            System.out.print("Quitar funciona\n");
        }else{
            System.out.print("Quitar no funciona\n");
        }
    }
    
}

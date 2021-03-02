/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPrincipal;

import paqCoche.Coche;

/**
 *
 * @author alumno2
 */
public class principalCoche {
    public static void main(String[] args){
    Coche lere=new Coche(3,"MANUAL","DIESEL");
        System.out.println(lere);
    
    try {
        lere.setPuertas(4);
    }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    };
    
    try {
        lere.setCambio("AUTOMATICO");
    }catch(IllegalArgumentException f){
        System.out.println(f.getMessage());
    };
    
    try {
        lere.setCombustible("ELECTRICO");
    }catch(IllegalArgumentException g){
        System.out.println(g.getMessage());
    };
    
    
    }
}

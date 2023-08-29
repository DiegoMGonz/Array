/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nexpresso;

import nexpresso.Entidades.Cafetera;
import nexpresso.Entidades.ServicioCafe;

/**
 *
 * @author Lenovo
 */
public class NexPresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCafe sc = new ServicioCafe();
        Cafetera cf = sc.llenar();
        
        sc.servir(cf);
        
        sc.vaciar(cf);
        sc.recarga(cf);
        
    }
    
}

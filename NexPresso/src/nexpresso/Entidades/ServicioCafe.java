/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nexpresso.Entidades;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ServicioCafe {
    String gstin;
    Scanner scr = new Scanner(System.in);
    Cafetera cf = new Cafetera();
    
    public Cafetera llenar(){
        cf.setCantidadActual(cf.getCapacidadMaxima());
        System.out.println("la cantidad actual es: "+ cf.getCantidadActual());
        return cf;
    }
    
    public void servir(Cafetera cf){
        int taza ;
        System.out.println("Ingrese la medida de la taza a llenar... ");
        
        taza = scr.nextInt();
        
        if (taza > cf.getCantidadActual()) {
            System.out.println("vertido cafe...");
            System.out.println("la taza no fue llenada con cafe por falta de este"
                    + " la taza quedo en: " + cf.getCantidadActual());
            cf.setCantidadActual(cf.getCantidadActual()-taza);
            System.out.println(" lo sentimos");
        }else{
            System.out.println("La taza quedo llena...");
            cf.setCantidadActual(cf.getCantidadActual()-taza);
        }
    
    } 
    
    public void vaciar(Cafetera cf){
        cf.setCantidadActual(0);
        System.out.println("La cafetera fue vaciada");
    }
    
    public void recarga(Cafetera cf){
       int carga;
        do {
            System.out.println("Ingrese la recarga");
            carga = scr.nextInt();
            if (carga>cf.getCapacidadMaxima()) {
                System.out.println("Superaste su capacidad vuelve a intentar");
                
            }else if (carga<=cf.getCapacidadMaxima()) {
                System.out.println("correcto");
                cf.setCantidadActual(carga);
            }
            
         //cuando la condicion es falsa en el bucle, se quita de el.   
        } while (carga > cf.getCapacidadMaxima());
        
        System.out.println("La cantidad actual de cafe es: " + cf.getCantidadActual());
    }
    
}   







//      Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
//cuanto quedó la taza. 
//     Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//     Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
//recibe y se añade a la cafetera la cantidad de café indicada.        
//}

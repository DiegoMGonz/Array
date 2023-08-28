/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciruguia;

import ciruguia.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ciruguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scr = new Scanner(System.in);
       Operacion op = new Operacion();
       
       crear(op,scr);
       operation(op);
       
    }
    
    public static void crear(Operacion op,Scanner scr){
        System.out.println("Ingrese los dos valores");
        op.setNum1(scr.nextInt());
        op.setNum2(scr.nextInt());
        
    }
    
    public static void operation(Operacion op){
        int suma ;
        int resta;
        
        suma = op.getNum1()+op.getNum2();
        resta = op.getNum1()-op.getNum2();
        System.out.println("La suma es: "+suma + "   laresta es: "+resta);
        
    }
    
}

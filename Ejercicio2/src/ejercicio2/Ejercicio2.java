/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
//tipo real. A continuación, se deben crear los siguientes métodos: 
//a) Método constructor que inicialice el radio pasado como parámetro. 
//b) Métodos get y set para el atributo radio de la clase Circunferencia. 
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
//objeto. 
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).


        
        
        Scanner scr = new Scanner(System.in);

        Circulo c1 = new Circulo();

        crearCircunferencia(c1, scr);
        area(c1);
        perimetro(c1);
        

    }
    
    public static void crearCircunferencia(Circulo c1,Scanner scr){
        System.out.println("Ingrece el redio de la circunferencia");
        c1.setRadio(scr.nextDouble());
        
    }
    
    public static void area(Circulo c1){
        double area;
        
        System.out.println("El area de la circunferencia es: ");
        
        area = Math.PI*Math.pow(c1.getRadio(), 2);
        
        System.out.println(area);
    }
    
    public static void perimetro(Circulo c1){
        double perimetro ;
        System.out.println("El perimetro de la circunferenci es de: ");
        perimetro = 2*Math.PI*c1.getRadio();
        System.out.println(perimetro);
    }
    
}

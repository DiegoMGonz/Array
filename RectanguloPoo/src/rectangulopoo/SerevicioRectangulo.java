/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulopoo;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SerevicioRectangulo {
    Scanner scr = new Scanner(System.in).useDelimiter("\n");
  
    
    public Rectangulo CrearRectangulo(){
        Rectangulo rt = new Rectangulo();
        System.out.println("Introdusca la base del rectangulo");
        rt.setBase(scr.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rt.setAltura(scr.nextInt());
        
       return rt;
        
    }
    
    public void Superficie(Rectangulo rt){
        System.out.println("La superficie del rectangulo er: ");
        
        int superficie = rt.getBase()*rt.getAltura();
        System.out.println(superficie);
    }
    
    public void perimetro(Rectangulo rt){
        System.out.println("El perimetro del rectangulo es: ");
        int perimetro = (rt.getBase()*rt.getAltura())*2;
        System.out.println(perimetro);
    }
    
    public void figura(Rectangulo rt){
        
        for (int i = 0; i < rt.getBase(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        for (int i = 0; i < rt.getAltura()-2; i++) {
            System.out.print("*");
            for (int j = 0; j < rt.getBase()-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int i = 0; i < rt.getBase(); i++) {
            System.out.print("*");
        }

    }
    
}
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
//base y un atributo privado altura.
//La clase incluirá un método para crear el rectángulo 
//con los datos del Rectángulo dados por el usuario. También incluirá un método para 
//calcular la superficie del rectángulo y un método para calcular el perímetro del 
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters, 
//setters y constructores correspondientes. 
//Superficie = base * altura / Perímetro = (base + altura) * 2. 
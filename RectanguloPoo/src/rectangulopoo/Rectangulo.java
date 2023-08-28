/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulopoo;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado 
//base y un atributo privado altura.
//La clase incluirá un método para crear el rectángulo 
//con los datos del Rectángulo dados por el usuario. También incluirá un método para 
//calcular la superficie del rectángulo y un método para calcular el perímetro del 
//rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
//asteriscos usando la base y la altura. Se deberán además definir los métodos getters, 
//setters y constructores correspondientes. 
//Superficie = base * altura / Perímetro = (base + altura) * 2. 

public class Rectangulo {
    
    private Integer base;
    private Integer altura;

    public Rectangulo() {
    }
    
    

    public Rectangulo(Integer base, Integer altura) {
        if (base > 2  ) {
            this.base = base;
        }
        if (altura >1 && altura < base) {
              this.altura = altura;
        }
        
      
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        if (base > 0) {
            this.base = base;
        }
        
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }
    
   
       
           
            
   
        
    
    
    
}


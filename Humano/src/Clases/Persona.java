/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Persona {
//    Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
//atributo, puede hacerlo. Los métodos que se implementarán son: 
    private String nombre;
    private int edad;
    private String sexo;
    private Integer peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Integer peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        if (sexo.equals("hombre")||sexo.equals("mujer")||sexo.equals("otro")) {
            this.sexo = sexo;
        }else{
            System.out.println("Error");
        }
        
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

}

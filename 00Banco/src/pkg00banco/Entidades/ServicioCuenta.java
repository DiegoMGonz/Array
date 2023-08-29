/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00banco.Entidades;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ServicioCuenta {
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//      y se la sumara a saldo actual. 
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
//     la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//      pondrá el saldo actual en 0. 
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//      usuario no saque más del 20%. 
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
    
//    private int numeroCuenta;
//    private int DNI;
//    private int saldoActual;
//    private int interes;

    Scanner scr = new Scanner(System.in).useDelimiter("\n"); 
    
    /**
     * 
     * @return  c1
     */
    public CuentaBancaria crearCuenta(){
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingrese el numero de la cuenta");
        c1.setNumeroCuenta(scr.nextInt());
        System.out.println("su DNI");
        c1.setDNI(scr.nextInt());
        System.out.println("saldo actual");
        c1.setSaldoActual(scr.nextInt());
        
        return c1;
    }
    
    /**
     * 
     * @param c1 
     */
    public void depocito(CuentaBancaria c1){
        System.out.println("cuanto dinero desea ingresar a su cuenta");
        int masu = scr.nextInt();
        c1.setSaldoActual(c1.getSaldoActual()+ masu);
        System.out.println("su saldo actual es: " + c1.getSaldoActual());
    }
    
    /**
     * 
     * @param c1 
     */
    public void retirar(CuentaBancaria c1){
        System.out.println("cuanto dinero desea etirar");
        int taqui = scr.nextInt();
        if (c1.getSaldoActual() < taqui) {
            c1.setSaldoActual(0);
            System.out.println("Lo sentimos el monto ingresado exede el saldo que posee,"
                    + " su saldo actual es de: "+ c1.getSaldoActual());
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-taqui);
            System.out.println("su saldo actual es: " + c1.getSaldoActual());
        }
        
    }
    
    public void extraccionRapida(CuentaBancaria c1){
        System.out.println("Desea realizar una extraccion rapida?");
        
        String opcion = scr.next();
        switch (opcion){
            case "si":
                
                int extrac = (c1.getSaldoActual()/100)*20; 
                c1.setSaldoActual(c1.getSaldoActual()-extrac);
                System.out.println("su saldo dispinible es de: "+c1.getSaldoActual()+" Lo retirado es de: " + extrac);
                break;
            
            case "no":
                System.out.println("Opcion rechasada");
                break;
            default:
                System.out.println("Opcion invalida");
            
        } 
    }
    
    public void consulta(CuentaBancaria c1){
        System.out.println("deseas ver tu saldo?");
        String option = scr.next();
        switch(option){
            case "si":
                System.out.println("Tu saldo disponible es de: " + c1.getSaldoActual());
                break;
            case "no":
                System.out.println("OK que tengas buen dia");
                break;
            default:
                System.out.println("Opcion invalida");
                
        }
        
        
    }
    
    public void datos(CuentaBancaria c1){
        System.out.println(c1);
    }
    
}

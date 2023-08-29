/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00banco.Entidades;

/**
 *
 * @author Lenovo
 */
public class CuentaBancaria {
    //Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
//Las operaciones asociadas a dicha clase son: 
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés. 
//b) Agregar los métodos getters y setters correspondientes 
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario. 
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
//      y se la sumara a saldo actual. 
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se 
//l     a restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se 
//      pondrá el saldo actual en 0. 
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
//      usuario no saque más del 20%. 
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;
    private int interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int DNI, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    

   
    
    
    
    
}



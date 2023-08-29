/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00banco;

import pkg00banco.Entidades.CuentaBancaria;
import pkg00banco.Entidades.ServicioCuenta;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
 
    ServicioCuenta tt = new ServicioCuenta();
    CuentaBancaria c1 = tt.crearCuenta();
    tt.depocito(c1);
    tt.retirar(c1);
    tt.extraccionRapida(c1);
    tt.consulta(c1);
    tt.datos(c1);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmproyecto;

/**
 *
 * @author Dell
 */
public class ATM {
    private Dispensador dispensadorObj;
    private Pantalla pantallaObj;
    private RanuraDeDeposito ranuraDeDepositoObj;
    private Teclado tecladoObj;
    
    public ATM (){
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        
        this.inicializar();
    }
     
    private void inicializar(){
        
        int numeroDeCuenta;
        int nip;
                
        pantallaObj.mostrarMensaje("Bienvenido\n");
        pantallaObj.mostrarMensaje("Ingrese su numero de cuenta: ");
        numeroDeCuenta = tecladoObj.recibirEntrada();
        
        if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000) {
          
            System.out.println("El numero de cuenta ingresado es: " + numeroDeCuenta);
        } 
        else {
            System.out.println("Ingrese un numero de cuenta válido.");
        }
         
        pantallaObj.mostrarMensaje("Ingrese su NIP: ");
        nip = tecladoObj.recibirEntrada();
        
        if (nip > 9999 && nip < 100000) {
          
            System.out.println("NIP CORRECTO");
        } 
        else {
            System.out.println("NIP incorrecto.");
        }
   }
    
    public void depositar (int monto){
        
    }
    
    void acreditar(int monto) { 
    
    }
    void mostrarSaldo(int numeroDeCuenta) {
    
    }
    void retirar(int monto) {
    
    }
    void debitar(int monto) {
    
    }
    boolean autenticar(int nip, int numeroDeCuenta) { return true; }
}

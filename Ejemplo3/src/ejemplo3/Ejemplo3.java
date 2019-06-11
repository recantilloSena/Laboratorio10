/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author Ricardo
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        Cuentas cuenta=new Cuentas("03456", "credito", 43000);
        
        cuenta.consignar(7000);
        cuenta.retirar(55000);
        System.out.println("saldo actual: "+cuenta.getSaldoActual()+"  su capacidad de credito es: "+cuenta.getCapacidadCredito());
        
        
        
        
        
    
    
    }
    
}

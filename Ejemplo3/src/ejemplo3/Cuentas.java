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
public class Cuentas {
    
       private String numero;
       private  String tipo;
       private  double saldoActual;
       private  double valorInicial;
       private  double saldoMinimo;

    public Cuentas() {
    }

    public Cuentas(String numero, String tipo, double valorInicial) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorInicial = valorInicial;
        this.saldoActual = valorInicial;
        this.saldoMinimo = valorInicial * 0.1;
    }
    
    public void consignar(double monto){
        this.saldoActual = saldoActual + monto;
    }
    
    public void retirar(double monto) {
        
        if (monto > saldoActual ){
            this.saldoActual =  saldoMinimo;
        }else {
        
        if (saldoActual - monto <= saldoMinimo ){
            this.saldoActual = saldoActual - (monto - saldoMinimo);
        
        }else {
            this.saldoActual = saldoActual - monto ;
        }
        
        }
        
    }
    
    
    public double getCapacidadCredito() {
        
        if ("ahorro".equals(this.tipo)){
            return this.saldoActual - this.saldoMinimo;
        }else {
            return 3 * this.saldoActual;
        }
        
        
    }
    

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

   

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }




    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ely
 */
public class Modelo {
    private int numero1;
    private int numero2;
    private int resultado;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int Multiplicar(){
        this.resultado=this.numero1*this.numero2;
        return this.resultado;
    }
    public int Sumar(){
        this.resultado=this.numero1+this.numero2;
        return this.resultado;
    }
    public int Restar(){
        this.resultado=this.numero1-this.numero2;
        return this.resultado;
    }
     public int Dividir(){
        this.resultado=this.numero1/this.numero2;
        return this.resultado;
    }
}


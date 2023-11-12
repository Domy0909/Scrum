/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercitazionescrum;

/**
 *
 * @author Domenico
 */
public class Operazioni_base {

    public Operazioni_base() {
    }
    
    
    public double somma(double a, double b) {
        return a+b;
    }

    public double differenza(double a, double b) {
        return a-b;
    }

    public double moltiplicazione(double a, double b) {
        return a*b;
    }

    public double divisione(double a, double b) {
        if (b != 0) {
            return a/b;
        } else {
            throw new ArithmeticException("Divisione per zero non consentita!");
        }
    }

    
}

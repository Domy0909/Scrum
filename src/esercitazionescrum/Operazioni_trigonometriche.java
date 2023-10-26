/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercitazionescrum;

/**
 *
 * @author User
 */
public class Operazioni_trigonometriche {
    
      public Operazioni_trigonometriche(){
    }
    
     public double coseno(double a) {
         a= Math.toRadians(a);
         a=Math.cos(a);
        return a;
    }

    public double seno(double a) {
        a= Math.toRadians(a);
        a=Math.sin(a);
        return a;
    }

    public double tangente(double a) {
        a= Math.toRadians(a);
        a=Math.tan(a);
        return a;
    }
    
}

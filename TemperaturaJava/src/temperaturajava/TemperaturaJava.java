/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturajava;

/**
 *
 * @author Administrador
 */
public class TemperaturaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double C, K, F, Re, Ra;
        C = 2.78;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura em Fahrenheit é: " + F);
        System.out.println("A temperatura em Kelvin é: " + K);
        System.out.println("A temperatura em Reaumur é: " + Ra);
        System.out.println("A temperatura em Rankine é: " + Re);
    }
    
}

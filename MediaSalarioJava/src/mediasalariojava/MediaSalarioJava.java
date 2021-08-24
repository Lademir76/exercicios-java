/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasalariojava;

/**
 *
 * @author Administrador
 */
public class MediaSalarioJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double n1, n2, n3, n4, n5, media;

        n1 = 1000.00;  // coloque  valores
        n2 = 1200.00;
        n3 = 1000.00;
        n4 = 1050.00;
        n5 = 1200.00;

        media = (n1 + n2 + n3 + n4 + n5) / 4;
        System.out.println("A média salarial da empresa é de R$ " + media);
    }
}    
 

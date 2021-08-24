/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);  
     
    // vamos solicitar o código e o preço atual do produto
    System.out.print("Informe o código do produto: ");
    int codigo = Integer.parseInt(entrada.nextLine());
    System.out.print("Informe o preço atual do produto: ");
    double precoAtual = Double.parseDouble(entrada.nextLine());
     
    // vamos calcular o desconto
    double desconto;
    // o preço é menor que 30.00?
    if(precoAtual < 30){
      desconto = 0.0; // não há desconto  
    }
    // Igual ou superior a R$ 30,00 e menor que R$ 100,00
    else if((precoAtual >= 30.00) && (precoAtual < 100.00)){
      desconto = precoAtual * 0.1; // desconto de 10%
    }
    // Igual ou acima de R$ 100,00
    else{
      desconto = precoAtual * 0.15; // desconto de 15%
    }
     
    // mostra o resultado
    System.out.println("Preço Atual: " + precoAtual);
    System.out.println("Desconto: " + desconto);
    System.out.println("Novo Preço: " + (precoAtual - desconto));
     
    System.out.println("\n");
  }
} 
       

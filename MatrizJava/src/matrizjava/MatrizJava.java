/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizjava;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class MatrizJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // vamos declarar e instancia um objeto da classe Scanner
    Scanner entrada = new Scanner(System.in);
 
    // vamos declarar e construir uma matriz de 10 ints
    int valores[] = new int[10];
 
    double media; // média dos valores
    int soma = 0; // soma dos valores lidos
    int quantAcimaMedia = 0; // quantidade de valores acima da média
 
    // vamos solicitar ao usuário que informe os 10 valores inteiros
    // e vamos armazená-los na matriz
    for(int i = 0; i < valores.length; i++){
      System.out.print("Informe o " + (i + 1) + "º valor: ");
      int valor = Integer.parseInt(entrada.nextLine());
      valores[i] = valor;
 
      // vamos adicionar este valor à soma
      soma = soma + valor;
    }
 
    // vamos obter a média dos valores lidos
    media = (soma / valores.length);
 
    // agora precisamos obter a quantidade de valores acima da média
    for(int i = 0; i < valores.length; i++){
      if(valores[i] > media){
        quantAcimaMedia++;
      }
    }
 
    // vamos exibir os resultados
    System.out.println("A média dos valores é: " + media);
    System.out.println("Quantidade de valores acima da média: " + 
      quantAcimaMedia);
  }
}


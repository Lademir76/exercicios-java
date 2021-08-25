/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ArvoreBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
       
    // vamos criar um novo objeto da classe ArvoreBinariaBusca
    ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
    
    // vamos inserir 5 valores na árvore
    for(int i = 0; i < 5; i++){
      System.out.print("Informe um valor inteiro: ");
      int valor = Integer.parseInt(entrada.nextLine());
       
      // vamos inserir o nó e verificar o sucesso da operação
      if(!arvore.inserir(valor)){
        System.out.println("Não foi possível inserir. Um elemento já contém este valor.");  
      }
    }
     
    // vamos pesquisar um valor na árvore
    System.out.print("\nInforme o valor a ser pesquisado: ");
    int valorPesquisa = Integer.parseInt(entrada.nextLine());
    // obtém um objeto da classe NoArvore a partir do 
    // método pesquisar() da classe ArvoreBinariaBusca
    NoArvore res = arvore.pesquisar(valorPesquisa);
    // o valor foi encontrado?
    if(res != null){
      System.out.println("O valor foi encontrado na árvore");
    }
    else{
      System.out.println("O valor não foi encontrado na árvore");  
    }
     
    System.out.println("\n");
    }
}

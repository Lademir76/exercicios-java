/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Administrador
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int[] dados = {-2, -1, 1, 2, 3, 5, 6, 7, 9, 10, 10, 11, 11, 12, 13, 14, 16, 17, 18, 20};
        //O valor do útimo valor não pode ser maior do que 20.
        //Se quiser valores maiores deverá fazer mais partições na tabela - linha 13 a 16.
        int[] tabela = new int[5];//Tabela de índices 

        //Preparando a tabela de índices
        int k = 4;
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = k;
            k += 4;//São cinco índices que criam faixas de valores - faixa 1 (-2,-1,1,3)
        }

        //Valor a ser pesquisado
        int elemento = 3;//Troque esse valor para testar

        //Procura na tabela
        int valorMax = -1;//Se não achar!
        for (int i = 0; i < tabela.length; i++) {
            if (elemento <= tabela[i]) {
                valorMax = tabela[i];
                break;
            }
        }

        String elementoEncontrado = "Não!";
        int i=-1;
        if (valorMax > 0) {
            for (i = valorMax - 4; i < dados.length; i++) {
                if (elemento == dados[i]) {
                    elementoEncontrado = "Sim!!";
                    break;
                }
            }
        }
        if(i==dados.length){
          i=-1;
        }
        System.out.println("Tem o elemento? " + elementoEncontrado+" Posição: "+i);

    }
}  
    
    


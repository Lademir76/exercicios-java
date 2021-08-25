/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author Administrador
 */
class ArvoreBinariaBusca {
  private NoArvore raiz; // referência para a raiz da árvore
   
  // método usado para inserir um novo nó na árvore
  // retorna true se o nó for inserido com sucesso e false
  // se o elemento
  // não puder ser inserido (no caso de já existir um 
  // elemento igual)
  public boolean inserir(int valor){
    // a árvore ainda está vazia?
    if(raiz == null){
      // vamos criar o primeiro nó e definí-lo como a raiz da árvore
      raiz = new NoArvore(valor); // cria um novo nó
    }
    else{
      // localiza o nó pai
      NoArvore pai = null;
      NoArvore noAtual = raiz; // começa a busca pela raiz
  
      // enquanto o nó atual for diferente de null
      while(noAtual != null){
        if(valor < noAtual.getValor()) {
          pai = noAtual;
          noAtual = noAtual.getEsquerdo();
        }
        else if(valor > noAtual.getValor()){
          pai = noAtual;
          noAtual = noAtual.getDireito();
        }
        else{
          return false; // um nó com este valor foi encontrado
        }
      }
        
      // cria o novo nó e o adiciona ao nó pai
      if(valor < pai.getValor()){
         pai.setEsquerdo(new NoArvore(valor));
      }
      else{
        pai.setDireito(new NoArvore(valor));
      }
    }
 
    return true; // retorna true para indicar que o novo nó foi inserido
  }
   
  // método que permite pesquisar na árvore binária de busca
  public NoArvore pesquisar(int valor){
    return pesquisar(raiz, valor); // chama a versão recursiva do método
  }
 
  // sobrecarga do método pesquisar que recebe dois 
  // parâmetros (esta é a versão recursiva do método)
  private NoArvore pesquisar(NoArvore noAtual, int valor){
    // o valor pesquisado não foi encontrado....vamos retornar null
    if(noAtual == null){
      return null;
    }
  
    // o valor pesquisado foi encontrado?
    if(valor == noAtual.getValor()){
      return noAtual; // retorna o nó atual
    }  
    // ainda não encontramos...vamos disparar uma nova 
    // chamada para a sub-árvore da esquerda
    else if(valor < noAtual.getValor()){
      return pesquisar(noAtual.getEsquerdo(), valor);
    }
    // ainda não encontramos...vamos disparar uma nova 
    // chamada para a sub-árvore da direita
    else{
      return pesquisar(noAtual.getDireito(), valor);
    }
  }
}
  

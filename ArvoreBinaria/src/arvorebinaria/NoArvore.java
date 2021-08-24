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
class NoArvore {
 private int valor; // valor armazenado no nó
  private NoArvore esquerdo; // filho esquerdo
  private NoArvore direito; // filho direito
 
  // construtor do nó
  public NoArvore(int valor){
    this.valor = valor;
  }
 
  public int getValor() {
    return valor;
  }
 
  public void setValor(int valor) {
    this.valor = valor;
  }
 
  public NoArvore getEsquerdo() {
    return esquerdo;
  }
 
  public void setEsquerdo(NoArvore esquerdo) {
    this.esquerdo = esquerdo;
  }
 
  public NoArvore getDireito() {
    return direito;
  }
 
  public void setDireito(NoArvore direito) {
    this.direito = direito;
  }
   
}

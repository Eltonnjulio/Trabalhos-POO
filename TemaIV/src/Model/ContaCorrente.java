/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Elton Julio
 */
public class ContaCorrente extends ContaBancaria{
    
    private double taxaDeOperacao=5;
    @Override
    public void tipoT(){
    
    this.tipo ="Conta corrente";
    }
    @Override
    public boolean scacar(double valor) {
    
      if(valor<=(this.saldo-taxaDeOperacao)){
      this.saldo-=valor;
     this.saldo-=this.taxaDeOperacao;
     return true;
      }
      return false;
    }

    @Override
    public boolean depositar(double valor) {
        
        if(valor>0){
          this.saldo +=valor; 
         this.saldo-=this.taxaDeOperacao;
        return true;}
      return false;
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public String toString() {
        return"Conta Corrente :"+this.numeroDaConta+"\n"+"Saldo :"+this.saldo+"\n"+"Historico :"+this.historico+"\n"+"Taxa de operacao"+this.taxaDeOperacao;
    }

    @Override
    public String mostrarDados() {
     return this.toString();
    }
    
    
}

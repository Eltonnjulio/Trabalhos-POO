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
public class ContaPoupanca extends ContaBancaria{
   @Override
   public void tipoT(){
    
    this.tipo ="Conta poupanca";
    }
  private double limite=1000;    
    @Override
    public boolean scacar(double valor) {
      if(valor<=this.saldo+limite){
      this.saldo-=valor;
     return true; 
      }
   return false; }

    @Override
    public boolean depositar(double valor) {
    if(valor>0){
    this.saldo+=valor;
    return true;
    }
    return false;}
     @Override
    public String toString() {
        return"Conta Poupança:"+this.numeroDaConta+"\n"+"Saldo :"+this.saldo+"\n"+"Historico :"+this.historico+"\n"+"Limite :"+this.limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

   @Override
    public String mostrarDados() {
     return this.toString();
    }
    
     
}

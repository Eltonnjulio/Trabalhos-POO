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
public abstract class ContaBancaria implements Imprimivel {
    
  public String numeroDaConta,historico,tipo;
    double saldo;
    
   public abstract boolean scacar(double valor);
   public abstract boolean depositar(double valor);

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
    public boolean transferir(double valor, ContaBancaria conta){
    
        if(this.numeroDaConta.equalsIgnoreCase(conta.getNumeroDaConta())){return false;
    
    }else{
    if((valor>0)&&(valor<this.saldo)){
        
    this.scacar(valor);
    conta.depositar(valor);  
    return true;}
    
    return false;
    }
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  public abstract void tipoT();  

    @Override
    public String toString() {
        return "ContaBancaria:\n" + "numeroDaConta: " + this.numeroDaConta + "\n tipo:" + this.tipo + "\nsaldo:" + this.saldo;
    }
  
  
}

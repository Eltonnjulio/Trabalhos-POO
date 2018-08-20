/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.Relatorio;

import javax.swing.JOptionPane;

/**
 *
 * @author Elton Julio
 */
public class Executavel {
    public static void main(String[] args) {
    
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        
    contaCorrente.setSaldo(1000);
    contaPoupanca.setSaldo(1000);
       Relatorio relatorio = new Relatorio();
     if(contaCorrente.scacar(Double.parseDouble(JOptionPane.showInputDialog("Conta Corrente"+"\n"+"Saldo Disponivel :"+(contaCorrente.getSaldo()-contaCorrente.getTaxaDeOperacao())+"\n"+"Quanto deseja levantar?")))){JOptionPane.showMessageDialog(null,"Operação efetuada com sucesso! \n Saldo Actual: "+contaCorrente.getSaldo());}
     else{JOptionPane.showMessageDialog(null,"Operação efetuada sem sucesso!\n Saldo Actual: "+contaCorrente.getSaldo());}  
     
      
    JOptionPane.showMessageDialog(null,relatorio.gerarRelatorio(contaCorrente));
   if(contaPoupanca.scacar(Double.parseDouble(JOptionPane.showInputDialog("Conta Poupança"+"\n"+"Saldo Disponivel :"+(contaPoupanca.getSaldo())+"\n"+"Quanto deseja levantar?")))){JOptionPane.showMessageDialog(null,"Operação efetuada com sucesso!\n Saldo Actual: "+contaPoupanca.getSaldo());}
     else{JOptionPane.showMessageDialog(null,"Operação efetuada sem sucesso!\n Saldo Actual: "+contaPoupanca.getSaldo());}    
    
  
  
      JOptionPane.showMessageDialog(null,relatorio.gerarRelatorio(contaPoupanca));
   
    
    }
    
    
    
}

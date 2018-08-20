/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.lang.annotation.ElementType;
import java.util.ArrayList;

/**
 *métodos inserir, remover e procurarConta.
O primeiro e o segundo recebem um objeto conta (que pode ser corrente ou poupança) e o
insere e remove no ArrayList, respectivamente. O terceiro recebe um inteiro como
parâmetro representando o número da conta e retorna um objeto conta bancária, caso essa
conta exista no ArrayList, ou null, caso contrário
 * @author Elton Julio
 */
public class Banco implements Imprimivel {
 static ArrayList<ContaBancaria> contas = new ArrayList();   
 
 
public static boolean inserir(ContaBancaria conta){
 
 if(conta!=null){
 contas.add(conta);
 return true;}
 return false;
 }
 
 public static boolean remover(ContaBancaria conta){
  if(conta!=null){
 contas.remove(conta);
 
 return true;
  }
  return false;
 }
 
 
public static ContaBancaria procurarConta(int nrconta){
 
 for(ContaBancaria conta:contas){
 
 if(conta.getNumeroDaConta().equals(String.valueOf(nrconta)))
 
 return conta;
 
 
 
 
 }
 return null;
 }

    @Override
    public String mostrarDados() {
       for(ContaBancaria conta:contas){
       
       return conta.toString();
       
       
       } 
       return null;
    }

    public static ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public static void setContas(ArrayList<ContaBancaria> contas) {
        Banco.contas = contas;
    }
    
    
}

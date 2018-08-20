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
public class Relatorio {
    
    
    public String gerarRelatorio(Imprimivel objecto){
    
   return"Relatorio\n"+objecto.mostrarDados();
    }
    
   
}

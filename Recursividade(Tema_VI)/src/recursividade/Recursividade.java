/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;


import java.util.Vector;

/**
 *@version 1
 * @author Elton Julio
 */
public class Recursividade {

 /**
 * 
 * @param x
 * @return factorial de um numero natural
 */
    //Exercicio 1
    static Long factorial(int x){
        
  return ((x==1)||(x<=0)) ? 1:factorial(x-1)*x;
  
    }
    
    /**
     * Calcula soma de todos elementos do vector de inteiros
     * @param inteiros
     * @param n
     * @return long
     */
    //Exercicio 2
    static long somaVectores(Vector<Integer> inteiros,int n){

return (n==0)?n:somaVectores(inteiros, n-1)+inteiros.get(n-1);
   
    }
    
    /** 
     * Method inverte um numero inteiro ex:123 para 321
     * @param n
     * @return string
     */
 //Exercicio 3
static String inverte(int n){

return(n==0)?String.valueOf(("")): String.valueOf(n%10)+inverte(n/10);

}
  
    
/** 
 * faz a multiplicação de dois numeros sem usar o operaor *
 * @param x
 * @param y
 * @return long
 */
 //Exercicio 4

 static long multiplicacao(int x, int y){
 if(x==0 )return 0;
  if(x==1)return y;
   if(y==1)return x;
 
    return x + multiplicacao(x, y - 1);
 
 }

 /**
  * Converte um numero natural de decimal para binario
  * @param n
  * @return string
  */
 //Exercicio 5
 static String converteBinario(int n){

 return (n==0)?String.valueOf(0):converteBinario(n/2)+String.valueOf(n%2);

 }
  /**
   * Faz a soma de todos algarismos de um numero
   * @param n
   * @return 
   */
 //Exercicio 6
 static int somaAlgarismos(int n){

return(n==0)?0 :somaAlgarismos(n/10)+(n%10);
 
 }
 /**
  * Informa o numero de vezes que um digito k se repete em um numero N
  * @param k
  * @param n
  * @return 
  */
 //Exercicio 7
   static int verificaK(int n,int k){
        int i = 0;
        if(n==0)
            return i;
        if(n%10==k)
          i++;
        return i+verificaK(n/10, k);
    }
 /**
  * Gera todas as possiveir combinações das primeiras n letras do alfabeto
  * @param x
  * @return 
  */
 //Exercicio 8
   
   
   
   static String combinacoes(int n,int cont){

       if(factorial(n)==cont)return"";
       cont++;
  return chars(n) + combinacoes(n,cont);
   }
   
    static String chars(int n){
  char chr ='A';
   String letras ="";
   for(int i = 0;i<n;i++){
   
  letras+=""+ chr++;
   
   }
 return letras;
   } 
   
   public static void imprimeAnagramas(String prefixo, String palavra) {
		if (palavra.length() <= 1) {
			System.out.println(prefixo + palavra);
		} else {
			for (int i = 0; i < palavra.length(); i++) {
				String cur = palavra.substring(i, i + 1);
				String before = palavra.substring(0, i); 
				String after = palavra.substring(i + 1); 
				imprimeAnagramas(prefixo + cur, before + after);
			}
                }}
   
    static long fibonacci(int x){
    if(x<=1) return x;
    
    return fibonacci(x-1)+fibonacci(x-2);}
    
    
//1 + (int) (Math.random() * 2) 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    

 

        
    imprimeAnagramas("",chars(4));
       
        
 
        
      
   
    }
    
}

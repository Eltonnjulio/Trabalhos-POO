/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Estudante;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Elton Julio
 */
public class DAO {
  /**
     * Gravando .
     *
     * @param Estudante
     * @return
     */
    
   static Session session = HibernateUtil.getSessionFactory().openSession();
   static Transaction transaction = session.beginTransaction();
    
private static boolean gravar(Estudante estudante) {
        

        try {
            session.save(estudante);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao tentar gravar Categoria: \n\t" + ex);
            return false;
        } finally {
            session.close();
        }
    }

    /**
     * Eliminando 
     *
     * @param estudante
     * @return
     */
private static boolean eliminar(Estudante estudante) {
 
        try {
            session.delete(estudante);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao tentar apagar Categoria: \n\t" + ex);
            return false;
        } finally {
            session.close();
        }
    }

    /**
     * Actualizando a categoria.
     *
     * @param categoria
     * @return
     */
    private static boolean actualizar(Estudante estudante) {
   
        try {
            session.merge(estudante);
            transaction.commit();
            return true;
        } catch (Exception ex) {
            System.out.println("Erro ao tentar actualizar Categoria: \n\t" + ex);
            return false;
        } finally {
            session.close();
        }
    }

    /**
     * Lendo 
     *
     * @return
     */
private static ArrayList<Estudante> ler() {
    
        Criteria criteria = session.createCriteria(Estudante.class);
        try {
          ArrayList<Estudante> estudantes = (ArrayList<Estudante>) criteria.list();
            transaction.commit();
            return estudantes;
        } catch (HibernateException ex) {
            System.out.println("Erro ao tentar ler Categorias: \n\t" + ex);
            return null;
        } finally {
            session.close();
        }
    }
    
   public static boolean gravar(String nome, String sexo, Date dataDeRegisto, Date dataDeNascimento){
    return gravar(new Estudante(nome, sexo, dataDeRegisto, dataDeNascimento));
    }
    
   
    public static boolean actualizar(int codigo, String nome, String sexo, Date dataDeRegisto, Date dataDeNascimento){ 
    return actualizar(new Estudante(codigo, nome, sexo, dataDeRegisto, dataDeNascimento));
    }
   
    
    public static boolean eliminar(int codigo, String nome, String sexo, Date dataDeRegisto, Date dataDeNascimento){
    return eliminar(new Estudante(codigo, nome, sexo, dataDeRegisto, dataDeNascimento));
    }
    
    public static ArrayList<String[]> lerMVC(){
        
    ArrayList<String[]> estudantes = new ArrayList();
    String[] auxiliar = new String[5];
    
    for(Estudante estudante: ler()){
    
    auxiliar[0] = String.valueOf(estudante.getCodigo());
    auxiliar[1] = estudante.getNome();
    auxiliar[2] = estudante.getSexo();
    auxiliar[3] = String.valueOf(estudante.getDataDeRegisto());
    auxiliar[4] = String.valueOf(estudante.getDataDeNascimento());
  
    estudantes.add(auxiliar);
    }
    return estudantes;
    }
    
    public static String[] pesquisa(String chave){
  String[] array = new String[4];  
    for(String[] auxiliar: lerMVC()){
    
    if((chave.equalsIgnoreCase(auxiliar[1]))||(chave.equalsIgnoreCase(auxiliar[1])))
     array = auxiliar;
    }
  return array;
    }
}

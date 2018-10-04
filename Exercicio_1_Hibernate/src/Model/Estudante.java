/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Elton Julio
 */
@Entity(name="Estudante")
public class Estudante {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
private int codigo;
 @Column
private String nome;
 @Column
private String sexo;
 @Column
private Date dataDeRegisto;
 @Column
private Date dataDeNascimento;

    public Estudante(String nome, String sexo, Date dataDeRegisto, Date dataDeNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeRegisto = dataDeRegisto;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Estudante(int codigo, String nome, String sexo, Date dataDeRegisto, Date dataDeNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.dataDeRegisto = dataDeRegisto;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Estudante() {
    }

    
 
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the dataDeRegisto
     */
    public Date getDataDeRegisto() {
        return dataDeRegisto;
    }

    /**
     * @param dataDeRegisto the dataDeRegisto to set
     */
    public void setDataDeRegisto(Date dataDeRegisto) {
        this.dataDeRegisto = dataDeRegisto;
    }

    /**
     * @return the dataDeNascimento
     */
    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * @param dataDeNascimento the dataDeNascimento to set
     */
    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }


}

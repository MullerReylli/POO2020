/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03.salaaula;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    public final String  especie = "mamifero";
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
     
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
}

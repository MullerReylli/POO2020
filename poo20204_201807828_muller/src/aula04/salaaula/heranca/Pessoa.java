/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome da pessoa: " + this.getNome());
        sb.append("\n:Endereço da Pessoa: " + this.getEndereco());
        sb.append("\n:Telefone da essoa: " + this.getTelefone());
        return sb.toString();
    }
    
    
    
}

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
public class Cliente extends PessoaFisica {
    private Double renda;
    private String interesses;
    private String profissao;

    public Cliente(Double renda, String interesses, String profissao, String cpf, String estadoCivil, String sexo, String nome, String endereco, String telefone) {
        super(cpf, estadoCivil, sexo, nome, endereco, telefone);
        this.renda = renda;
        this.interesses = interesses;
        this.profissao = profissao;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome da pessoa: " + this.getNome());
        sb.append("\n:Endereço da Pessoa: " + this.getEndereco());
        sb.append("\n:Telefone da essoa: " + this.getTelefone());
        return sb.toString();
    }
    
}

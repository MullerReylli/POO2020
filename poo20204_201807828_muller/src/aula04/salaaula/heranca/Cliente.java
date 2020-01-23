/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Cliente extends PessoaFisica {
    private Double renda;
    private List<String> interesses;
    private String profissao;

    public Cliente(Double renda, String profissao, String cpf, String estadoCivil, String sexo, String nome, String endereco, String telefone) {
        super(cpf, estadoCivil, sexo, nome, endereco, telefone);
        this.renda = renda;
        this.profissao = profissao;
        
        interesses = new ArrayList<>();
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
    
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<String> getInteresses() {
        return interesses;
    }
    
    public void addInteresses(String interesse) {
        this.getInteresses().add(interesse);
    }
    
    public String consultaIteresse(String interesse){
        String novoInteresse = null;
        for (String s : this.getInteresses()) {
            if (s.equals(interesse)) {
                novoInteresse = s;
            }
        }
        return novoInteresse;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nRenda do cliente: " + this.getRenda());
        sb.append("\n:Interesses do cliente: ");
        for (String interesse : interesses) {
            sb.append(interesse);
        }
        sb.append("\n:Profissao do cliente: " + this.getProfissao());
        return sb.toString();
    }
    
}

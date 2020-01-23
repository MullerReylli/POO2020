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
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private String estadoCivil;
    private String sexo;
    
    public PessoaFisica(String cpf, String estadoCivil, String sexo, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("\nCPF da Pessoa Fisíca: " + this.getCpf());
        sb.append("\n:Estado Civil da Pessoa Fisica: " + this.getEstadoCivil());
        sb.append("\n:Sexo da Pessoa Fisica: " + this.getSexo());
        return sb.toString();
    }
    
    
    
}

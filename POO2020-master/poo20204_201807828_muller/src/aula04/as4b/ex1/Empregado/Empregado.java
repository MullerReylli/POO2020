/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.as4b.ex1.Empregado;

public class Empregado {
    private String nome;
    private String matricula;
    private Empresa empresa;

    public Empregado(String nome, String matricula, Empresa empresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome do empregado: " + getNome());
        sb.append("\nMatricula do empregado: " + getMatricula());
        sb.append("\nEmpresa do empregado: " + getEmpresa().toString());
        
        return sb.toString();
    }
}

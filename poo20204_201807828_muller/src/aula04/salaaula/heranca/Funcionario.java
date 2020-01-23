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
public class Funcionario {
    private int matricula;
    private double salario;
    private String cargo;

    public Funcionario(int matricula, double salario, String cargo) {
        this.matricula = matricula;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        sb.append("\nMatricula do funcionario: " + this.getMatricula());
        sb.append("\n:Salario do funcionario: " + this.getSalario());
        sb.append("\n:Cargo do funcionario: " + this.getCargo());
        return sb.toString();
    }
    
    
}

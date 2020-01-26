
package aula04.as4b.ex1.Aluno;

public class Aluno {
    private String nome;
    private String Matricula;
    private int ano;
    private Curso curso;

    public Aluno(String nome, String Matricula, int ano, Curso curso) {
        this.nome = nome;
        this.Matricula = Matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome do Aluno: " + getNome());
        sb.append("\nMatricula do Aluno: " + getMatricula());
        sb.append("\nAno do Aluno: " + getAno());
        sb.append("\nCurso do aluno:" + getCurso().toString());
        
        return sb.toString();
    }
}

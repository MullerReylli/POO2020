
package aula04.as4b.ex1.Aluno;

public class Departamento {
    private String nome;
    private String sigla;

    public Departamento(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nNome do Departamento: " + getNome());
        sb.append("\nSigla do Departamento: " + getSigla());
        
        return sb.toString();
    }
    
    
}

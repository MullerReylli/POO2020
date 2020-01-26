
package aula04.as4b.ex1.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Departamento d = new Departamento("Instituto de Informatica", "INF");
        Curso c = new Curso("Ciencia da Computação", "CC", d);
        Aluno a = new Aluno("João", "999999", 2020, c);
        
        System.out.println(a.toString());
    
    }
}

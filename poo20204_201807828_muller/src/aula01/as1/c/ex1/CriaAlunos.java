//aluno
package as1.c.ex1;

import java.util.Scanner;

public class CriaAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, matricula;
        String nome;
        Aluno a;
        String st = "";
        
        System.out.println("Entre com a quantidade de alunos:");
        i = Integer.parseInt(sc.nextLine());
        
        for (int j = 1; j <= i; j++) {
            System.out.println("Entre com a matricula:");
            matricula=Integer.parseInt(sc.nextLine());
            System.out.println("Entre com o nome:");
            nome = sc.nextLine();
            a = new Aluno(nome,matricula);
            st+=a.matricula+" - "+a.nome+"\n";
        }
        System.out.println(st);
    }
}


package aula03.salaaula;

import java.util.Date;

public class TestaPessoa {

    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Jorley");
        p1.setDataNascimento(new Date());
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Data Nascimento: " + p1.getDataNascimento());
        System.out.println("Espécie: " + p1.especie);
        
        Pessoa p2 = new Pessoa();
        System.out.println("Espécie: " + p2.especie);
    }
    
}

package aula03.salaaula;

import java.util.Date;

public class TestaPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		
		p1.setNome("Jorley");
		p1.setDataNascimento(new Date());
		
		System.out.println("Dados da Pessoa p1:\n");
		System.out.println(p1.toString());
		//System.out.println("Nome: " + p1.getNome());
		//System.out.println("Data Nascimento: " + p1.getDataNascimento());
		//System.out.println("Espécie: " + p1.especie);
		
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Alberto Roberto");
		
		System.out.println("Dados da Pessoa p2:\n");
		System.out.println("Nome da Pessoa p2: " + p2.getNome());
		System.out.println("Espécie: " + p2.especie);
	}

}

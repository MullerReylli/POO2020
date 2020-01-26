package aula03.salaaula;

import java.util.Date;

public class Pessoa {
	//Atributos
	private String nome;
	private Date dataNascimento;
	public final String especie = "mamifero";
	
	
	//Métodos
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\nNome: " + this.getNome());
		sb.append("\nDataNascimento: " + this.getDataNascimento());
		return sb.toString();
	}
	
}

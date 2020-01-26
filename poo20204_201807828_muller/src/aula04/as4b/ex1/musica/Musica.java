
package aula04.as4b.ex1.musica;

import aula04.as4b.ex1.musica.Compositor;

public class Musica {
    private String nome;
    private String ano;
    private String tipo;
    private Compositor compsitor;

    public Musica(String nome, String ano, String tipo, Compositor compsitor) {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compsitor = compsitor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Compositor getCompsitor() {
        return compsitor;
    }

    public void setCompsitor(Compositor compsitor) {
        this.compsitor = compsitor;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        
        sb.append("\nNome da musica: " + getNome());
        sb.append("\nAno da musica: " + getAno());
        sb.append("\nTipo de musica: " + getTipo());
        sb.append("\nCompositor da musica: " + getCompsitor().toString());
        
        return sb.toString();
    }
    
    
}

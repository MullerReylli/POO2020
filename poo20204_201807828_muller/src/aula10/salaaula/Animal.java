/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.salaaula;

/**
 *
 * @author aluno
 */
public class Animal {
    private String nome;
    private int coordenadaX;
    private int coordenadaY;
    
    Animal(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }
    
    protected void setCoordenadas(int x, int y){
        coordenadaX = x;
        coordenadaY = y;
    }
    
    public void mover(int x, int y){
        System.out.println("Não sei me mover");
    }
}

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
public class Peixe extends Animal{
    public Peixe(String nome) {
        super(nome);
    }
    public void nadar(){
        System.out.println("Sout um " + this.getClass().getSimpleName() + " e estou nadando.");
    }
    
    @Override
    public void mover(int x, int y){
        setCoordenadas(x, y);
        System.out.println("Movimento do Peixe");
    }
}

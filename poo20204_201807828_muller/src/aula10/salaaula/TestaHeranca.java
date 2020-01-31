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
public class TestaHeranca {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(3000);
        System.out.println("A bonificacao é: " + g.bonificacao());
       
    }
}

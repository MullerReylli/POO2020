/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.salaaula.heranca;

/**
 *
 * @author aluno
 */
public class HerancaTeste {
    public static void main(String[] args) {
        Pessoa p = new Cliente(5.000, "Professor", "999.999.999-99", "solteiro", "M", "João", "Goiânia", "999999");
        
        if (p instanceof Cliente) {
            Cliente c = (Cliente) p;
            
        }
        
        System.out.println("Dados do Cliente: " + p.toString());
        
    }
}

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
public class MundoAnimal {
    public static void main(String[] args) {
        Animal reino[];
        reino = new Animal[3];
        
        reino[0] = new Anfibio("Salamandra");
        reino[1] = new Ave("Quero-quero");
        reino[2] = new Peixe("Dourado");
        
        int tamanhoVetor = reino.length;
        
        for (int i = 0; i < tamanhoVetor; i++) {
            if (reino[i] instanceof Peixe) {
                ((Peixe) reino[i]).nadar();
            }else{
                reino[i].mover(10, 10);
            }
        }
    }
}

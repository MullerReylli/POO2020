
package aula04.as4b.ex1.musica;

import aula04.as4b.ex1.musica.Musica;
import aula04.as4b.ex1.musica.Compositor;

public class TestaMusica {
    public static void main(String[] args) {
        Compositor c = new Compositor("Marilia Mendonça", "Brasil");
        
        Musica m1 = new Musica("Graveto", "2020", "Sertanejo", c);
        Musica m2 = new Musica("Todo Mundo Vai Sofrer", "2019", "Sertanejo", c);
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
    }
}

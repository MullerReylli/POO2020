package as1.c.ex3;

import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v[] = new int[100];
        int n, aux, ex;
        
        System.out.println("Entre com a quantidade de numeros");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o "+(i+1)+"º numero:");
            v[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-1); j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
        System.out.println("Ordem Crescente:");
        for (int i = 0; i < n; i++) {
            System.out.println(v[i]);
        }
        System.out.println("Ordem decrescente:");
        for (int i = n-1; i >=0; i--) {
            System.out.println(v[i]);
        }
        
        System.out.println("Entre com o numero a ser encontrado");
        ex = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < n; i++) {
            if(v[i]==ex) System.out.println("Existe na posição: "+i);
        }
        
    }
}

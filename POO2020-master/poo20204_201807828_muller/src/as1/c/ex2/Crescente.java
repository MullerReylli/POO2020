package as1.c.ex2;

import java.util.Scanner;

public class Crescente {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, z, n1, n2, n3;

        x = Integer.parseInt(sc.nextLine());
        y = Integer.parseInt(sc.nextLine());
        z = Integer.parseInt(sc.nextLine());

        String st = "";

        if(x < y && x < z){
            if(y < z){
                st += x + " " + y + " " + z;
            }else{
                st += x + " " + z + " " + y;
            }
        }else if(y < x && y < z){
            if(x < z){
                st += y + " " + x + " " + z;
            }else{
                st += y + " " + z + " " + x;
            }
        }else if(z < x && z < y){
            if(x < y){
                st += z + " " + x + " " + y;
            }else{
                st += z + " " + y + " " + x;
            }
        }
        
        System.out.println(st);

    }
}

package baekjoon.bronze;

import java.util.Scanner;

public class B2523 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();

        for (int i = 0; i < a - 1; i++){
            for (int j = 0; j < i +1 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < a; i++){
            for (int k = a; k > i ; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

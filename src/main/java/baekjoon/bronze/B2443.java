package baekjoon.bronze;

import java.util.Scanner;

public class B2443 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = 2 * (a - i) -1 ; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

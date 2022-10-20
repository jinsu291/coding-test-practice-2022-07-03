package baekjoon.bronze;

import java.util.Scanner;

public class B2445 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        for (int i = 1; i < a + 1; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int k = 2 * (a - i); k > 0; k--){
                System.out.print(" ");
            }
            for (int m = 0; m < i; m++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a - i - 1; j++){
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i + 2; k++){
                System.out.print(" ");
            }
            for (int m = 0; m < a - i - 1; m++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
package baekjoon.bronze;

import java.util.Scanner;

public class B2739 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        for (int i = 0; i < 9; i++){
            System.out.println( a + " * " + (i + 1) + " = " + a * (i + 1));
        }
    }
}

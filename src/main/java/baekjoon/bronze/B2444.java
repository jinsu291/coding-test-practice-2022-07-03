package baekjoon.bronze;

import java.util.Scanner;

public class B2444 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        N = input.nextInt();

        for(int i = 0; i < N; i++) {
            for(int j = N-i-1; j > 0; j--) {
                System.out.print(" ");
            }

            for(int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }

            for(int k = (N-i-1)*2 -1; k > 0; k--) {
                System.out.print("*");
            }

            System.out.println();
        }
        input.close();
    }
}
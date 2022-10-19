package baekjoon.bronze;

import java.util.Scanner;

public class B1000 {
    public int solution(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        B1000 T = new B1000();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(T.solution(a, b));
    }
}

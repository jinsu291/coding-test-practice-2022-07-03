package lecture.B02_Array;

import java.util.Scanner;

// 어려움 다시보기!!
public class BMain402 {
    public void solution(int n){
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        BMain402 T = new BMain402();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        T.solution(n);
    }
}

package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class B1037 {

    public int solution(int n, int[] arr){
        int result = 0;
        int k = n / 2;

        Arrays.sort(arr);

        if (n % 2 == 1){
            result = arr[k] * arr[k];
        } else {
            result = arr[0] * arr[n - 1];
        }

        return result;
    }

    public static void main(String[] args) {
        B1037 T = new B1037();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}

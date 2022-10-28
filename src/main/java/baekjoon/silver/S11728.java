package baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

public class S11728 {
    private StringBuilder solution(int n, int m, int[] arr1, int[] arr2) {
        StringBuilder answer = new StringBuilder();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0, j=0;
        while(i<n && j<m) {
            if(arr1[i]<arr2[j]) {
                answer.append(arr1[i++]+" ");
            }else {
                answer.append(arr2[j++]+" ");
            }
        }

        while(i<n) {
            answer.append(arr1[i++]+" ");
        }
        while(j<m) {
            answer.append(arr2[j++]+" ");
        }
        return answer;
    }

    public static void main(String[] args) {
        S11728 T = new S11728();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr1, arr2));
    }
}
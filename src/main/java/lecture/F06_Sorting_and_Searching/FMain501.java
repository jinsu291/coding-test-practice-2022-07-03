package lecture.F06_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;

// 삽입정렬
public class FMain501 {
    public String  solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++){
            if (arr[i] == arr[i + 1]){
                answer = "D";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FMain501 T = new FMain501();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}

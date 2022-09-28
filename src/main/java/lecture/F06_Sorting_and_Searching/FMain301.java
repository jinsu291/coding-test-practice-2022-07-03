package lecture.F06_Sorting_and_Searching;

import java.util.Scanner;

// 삽입정렬
public class FMain301 {
    public int[] solution(int n, int[] arr){
        for (int i = 1; i < n; i++){
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--){
                if (arr[j] > tmp){
                    arr[j + 1] = arr[j];
                }
                else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        FMain301 T = new FMain301();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}

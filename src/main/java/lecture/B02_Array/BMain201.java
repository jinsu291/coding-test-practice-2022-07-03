package lecture.B02_Array;

import java.util.ArrayList;
import java.util.Scanner;

//o
public class BMain201 {
    public int solution(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        BMain201 T = new BMain201();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
            System.out.println(T.solution(n, arr));
    }
}

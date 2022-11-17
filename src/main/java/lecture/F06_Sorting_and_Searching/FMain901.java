package lecture.F06_Sorting_and_Searching;

import java.util.Arrays;
import java.util.Scanner;
//★
//ㅇㅇ
public class FMain901 {
    private int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        // Arrays.stream(arr) : 배열에 스트림을 얻을때이고, .max() 최대값인데, 리턴값이 int가 아니라서
        // .getAsInt(); 를 붙여야한다.
        int rt = Arrays.stream(arr).sum(); // sum() 합하는 것, 그리고 리턴값은 int이다.
        while (lt <= rt){
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= k) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FMain901 T = new FMain901();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}

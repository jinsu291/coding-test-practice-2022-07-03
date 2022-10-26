package lecture.B02_Array;

import java.util.Scanner;
//★
//ㅇ
public class BMain501 {
    public int solution(int n){
        int cnt = 0;
        int[] ch = new int[n+1];
        for(int i = 2; i <= n; i++){
            if(ch[i] == 0){
                cnt++;
                for(int j = i; j <= n; j = j + i) ch[j] = 1; // j는 i만큼 증가한다, -> i의 배수
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        BMain501 T = new BMain501();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}

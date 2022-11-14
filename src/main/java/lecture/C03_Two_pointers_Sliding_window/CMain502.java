package lecture.C03_Two_pointers_Sliding_window;

import java.util.Scanner;

//ㅇㅇ
public class CMain502 {
    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;
        while(n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CMain502 T = new CMain502();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}

package lecture.A01_String;

import java.util.Scanner;
// 다시 보기!!
public class AMain301 {
    public String solution(String str){
    String answer = "";
    int m = Integer.MIN_VALUE;
    String [] s = str.split(" ");
    for (String x : s){
        int len = x.length();
        if(len > m){
            m = len;
            answer = x;
        }
    }
    return answer;
    }

    public static void main(String[] args) {
        AMain301 T = new AMain301();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}

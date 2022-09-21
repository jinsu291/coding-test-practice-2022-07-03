package lecture.A01_String;

import java.util.Scanner;

// 다시보기!!
public class AMain901 {
    public int solution(String s) {
        String answer ="";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        AMain901 T = new AMain901();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

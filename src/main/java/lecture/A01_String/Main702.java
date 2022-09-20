package lecture.A01_String;

import java.util.Scanner;

// 다시보기!!
public class Main702 {
    public String solution(String str) {
        String answer ="NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return  answer;
    }

    public static void main(String[] args) {
        Main702 T = new Main702();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

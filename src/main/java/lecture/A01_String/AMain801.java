package lecture.A01_String;

import java.util.Scanner;

// 다시보기!!
public class AMain801 {
    public String solution(String s) {
        String answer ="NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        AMain801 T = new AMain801();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}

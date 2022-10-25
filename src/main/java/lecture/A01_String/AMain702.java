package lecture.A01_String;

import java.util.Scanner;

//o
public class AMain702 {
    public String solution(String str) {
        String answer ="NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)){
            answer = "YES";
        }
        return  answer;
    }

    public static void main(String[] args) {
        AMain702 T = new AMain702();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

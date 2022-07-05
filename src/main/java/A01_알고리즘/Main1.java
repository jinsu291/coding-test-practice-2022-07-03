package A01_알고리즘;

import java.util.Scanner;

public class Main1 {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();   //모두 대문자화
        t = Character.toUpperCase(t);
        //System.out.println(str + " " + t);
        for (char x : str.toCharArray()) {
            if(x == t) answer++;

        }

        return answer;
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

}

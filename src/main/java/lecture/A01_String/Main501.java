package lecture.A01_String;

import java.util.Scanner;
// 어려움 다시보기!!
public class Main501 {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt= str.length()-1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main501 T = new Main501();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

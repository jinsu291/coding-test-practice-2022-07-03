package lecture.A01_String;

import java.util.Scanner;

//o
public class AMain501 {
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
        AMain501 T = new AMain501();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

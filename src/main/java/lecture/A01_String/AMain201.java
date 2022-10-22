package lecture.A01_String;

import java.util.Scanner;
//o
public class AMain201 {
    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            }
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }


    public static void main(String[] args) {
        AMain201 T = new AMain201();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}

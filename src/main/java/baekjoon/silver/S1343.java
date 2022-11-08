package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'X') {
                count++;
            } else {
                if (count % 2 == 1) {
                    sb.append(-1);
                    break;
                }
                while (count != 0) {
                    if (count >= 4) {
                        sb.append("AAAA");
                        count -= 4;
                    } else {
                        sb.append("BB");
                        count -= 2;
                    }
                }
                sb.append(".");
            }
        }
        if (count > 0) {
            if(count%2 == 1) {
                sb = new StringBuilder();
                sb.append(-1);
            }else {
                while(count != 0) {

                    if(count >= 4) {
                        sb.append("AAAA");
                        count -= 4;
                    }else {
                        sb.append("BB");
                        count -= 2;
                    }
                }
            }
        }
        sb.append("\n");
        System.out.println(sb.toString());
    }
}

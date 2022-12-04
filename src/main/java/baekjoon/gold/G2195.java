package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class G2195 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, List<Integer>> hm = new HashMap<>();

        char[] str1 = br.readLine().toCharArray();
        for (int i = 0; i < str1.length; i++) {
            char c = str1[i];
            if (!hm.containsKey(c)) {
                hm.put(c, new ArrayList<>());
            }
            List<Integer> list = hm.get(c);
            list.add(i);
            hm.put(c, list);
        }
        char[] str2 = br.readLine().toCharArray();
        int i = 0, answer = 0;

        while (i < str2.length) {
            List<Integer> list = hm.get(str2[i]);
            int ret = 0;
            for (int idx : list) {
                int cnt = 0;
                int j = i;
                while (j < str2.length && idx < str1.length) {
                    if (str2[j] == str1[idx]) {
                        j++;
                        idx++;
                        cnt++;
                        continue;
                    }
                    break;
                }
                ret = Math.max(ret, cnt);
            }
            i += ret;
            answer++;
        }
        System.out.println(answer);
    }
}

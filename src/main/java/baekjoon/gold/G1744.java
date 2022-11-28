package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class G1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> pn = new ArrayList<>();
        ArrayList<Integer> mn = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k > 0) {
                pn.add(k);
            } else {
                mn.add(k);
            }
        }
        Collections.sort(pn, Collections.reverseOrder());
        Collections.sort(mn);

        int sum = 0, i = 0;
        while (i < pn.size()) {
            if (i + 1 < pn.size() && pn.get(i) != 1 && pn.get(i + 1) != 1)
                sum += pn.get(i++) * pn.get(i++);
            else
                sum += pn.get(i++);
        }

        i = 0;
        while (i < mn.size()) {
            if (i + 1 < mn.size() && mn.get(i) != 1 && mn.get(i + 1) != 1)
                sum += mn.get(i++) * mn.get(i++);
            else
                sum += mn.get(i++);
        }
        System.out.println(sum);
    }
}

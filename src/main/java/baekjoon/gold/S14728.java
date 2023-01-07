package baekjoon.gold;

import java.io.*;
import java.util.*;

public class S14728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chapter_num, study_time, answer = 0;
        StringTokenizer input = new StringTokenizer(br.readLine());
        chapter_num = Integer.parseInt(input.nextToken());
        study_time = Integer.parseInt(input.nextToken());
        int[] time = new int[study_time + 1];
        for (int x = 0; x < chapter_num; x++) {
            int chapter_study_time, score;
            StringTokenizer chapter_input = new StringTokenizer(br.readLine());
            chapter_study_time = Integer.parseInt(chapter_input.nextToken());
            score = Integer.parseInt(chapter_input.nextToken());
            for (int y = study_time; y >= chapter_study_time; y--) {
                time[y] = Math.max(time[y], time[y - chapter_study_time] + score);
            }
        }
        System.out.println(time[study_time]);
    }
}

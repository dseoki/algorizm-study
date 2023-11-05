package org.backzoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Q1343 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ["AAAA", "BB"]
        // 치환 가능한 값이 짝수
        // X가 홀수라면 -1 출력
        System.out.println(solution(br.readLine()));
        // outpout : AAAABB
    }

    public static String solution(String input) {
        int cnt = 0;
        int validCnt = 0;
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch == 'X') {
                cnt++;
            } else if (cnt % 2 != 0) {
                return "-1";
            }

            // stack ???
            if (ch == '.') {
                replacePolyo(cnt, sb);
                cnt = 0;
                sb.append(".");
                validCnt++;
            }
        }
        if (cnt % 2 != 0) {
            return "-1";
        }
        replacePolyo(cnt, sb);

        return sb.toString();
    }

    public static void replacePolyo(int count, StringBuilder sb) {
        IntStream.range(0, count / 4).forEach(i -> sb.append("AAAA"));
        count %= 4;

        IntStream.range(0, count / 2).forEach(i -> sb.append("BB"));
        count %= 2;
    }
}

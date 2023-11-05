package org.backzoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int end = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String[] times = br.readLine().split(" ");
            int std = Integer.parseInt(times[0]);
            if (std >= end) {
                cnt++;
                end = Integer.parseInt(times[1]);
            }
        }
        System.out.println(cnt);
    }
}

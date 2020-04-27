package com.company;

import java.util.Random;
import java.util.Scanner;

// 야구게임
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int rNums[] = new int[3];
        int nums[] = new int[3];
        boolean run = true;

        while (run) {
            for (int i = 0; i < rNums.length; i++) {
                int rNum = r.nextInt(9) + 1;
                rNums[i] = rNum;
            }
            if ((rNums[0] != rNums[1]) && rNums[0] != rNums[2] && rNums[1] != rNums[2]) {
                System.out.println("난수 설정 완료");
                run = false;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 3개 입력");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

    }
}

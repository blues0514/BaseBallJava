package com.company;

import java.util.Random;
import java.util.Scanner;

public class Prac2_Baseball {
    final static int MAX_NUMBER = 10;
    public static final int DIGIT = 3;

    public static void main(String[] args) {
        // 정답 생성( 0 ~ 9 사이의 중복 되지 않는 숫자)
        int answer0;
        int answer1;
        int answer2;

        // base class library(API) vs 3rd-party library
        Random r = new Random();

        while (true) {
            answer0 = r.nextInt(MAX_NUMBER);
            answer1 = r.nextInt(MAX_NUMBER);
            answer2 = r.nextInt(MAX_NUMBER);

            if (answer0 != answer1 && answer0 != answer2 && answer1 != answer2)
                break;
        }
        System.out.println(answer0 + "," + answer1 + "," + answer2);


        int tryCount = 0;
        while (true) {
            tryCount++;
            // 추측 입력
            int guess0;
            int guess1;
            int guess2;

            Scanner sc = new Scanner(System.in);
            guess0 = sc.nextInt();
            guess1 = sc.nextInt();
            guess2 = sc.nextInt();
            System.out.println(guess0 + "," + guess1 + "," + guess2);


            // 결과 계산
            int strike = 0;
            int ball = 0;
            int out = 0;


            if (guess0 == answer0)
                strike++;
            else if (guess0 == answer1 || guess0 == answer2)
                ball++;
            else
                out++;

            if (guess1 == answer1)
                strike++;
            else if (guess1 == answer0 || guess1 == answer2)
                ball++;
            else
                out++;

            if (guess2 == answer2)
                strike++;
            else if (guess2 == answer1 || guess2 == answer0)
                ball++;
            else
                out++;

            System.out.println(strike + "S " + ball + "B " + out + "O");

            // 3S가 아니면 돌아 간다
            if (strike == DIGIT) break;

        }

        // 도전 횟수 출력
        System.out.println("도전 횟수 : " + tryCount);

    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Module {
    public static final int DIGIT = 3;
    public static final int MAX_NUMBER = 10;

    /**
     * 정답을 생성한다. (0 ~ 9 사이의 중복되지 않는 3개의 숫자)
     */
    static int[] generateAnswers() {
        int[] answers = new int[DIGIT];

        // base class library(API)  vs. 3rd-party library
        Random random = new Random();

        while (true) {
            for (int i = 0; i < DIGIT; i++)
                answers[i] = random.nextInt(MAX_NUMBER); // liternal

            if (answers[0] != answers[1] && answers[1] != answers[2] && answers[2] != answers[0])
                break;
        }

        return answers;
    }

    /**
     * 추측 값을 입력 한다
     */
    public static int[] inputGuesses() {
        int[] guesses = new int[DIGIT];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < DIGIT; i++)
            guesses[i] = scanner.nextInt();

        return guesses;
    }



    public static void printNumbers(String prefix, int[] numbers) {
        System.out.println(prefix);
        for (int i = 0; i < DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

}

package com.company;

public class Result {
    private int strike = 0;
    private int ball = 0;
    private int out = 0;

    boolean isGood() {
        return strike == Main.DIGIT;
    }


    void calculate(Answer answer, Guess guess) {
        for (int i = 0; i < Main.DIGIT; i++) {
            int j = (i + 1) % Main.DIGIT; // (2+1) % 3 = 0
            int k = (i + 2) % Main.DIGIT; // (2+2) % 3 = 1

            if (guess.at(i) == answer.at(i))
                strike++;
            else if (guess.at(i) == answer.at(j) || guess.at(i) == answer.at(k))
                ball++;
            else
                out++;
        }
    }

    void print() {
        System.out.println("S:" + strike + " B:" + ball + " O:" + out);
    }
}

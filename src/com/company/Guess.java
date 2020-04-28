package com.company;

import java.util.Scanner;

public class Guess extends Parent{
    private int[] numbers = new int[Main.DIGIT];

    public void input() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Main.DIGIT; i++)
            numbers[i] = scanner.nextInt();
    }

    @Override
    public void print() {
        System.out.println("[추측]");
        for (int i = 0; i < Main.DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    @Override
    public int at(int i) {
        return numbers[i];
    }
}

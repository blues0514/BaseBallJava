package com.company;

public abstract class NumberContainer {
    protected int[] numbers = new int[Main.DIGIT];

    void print() {
        System.out.println(getPrefix());
        for (int i = 0; i < Main.DIGIT; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }

    public int at(int i) {
        return numbers[i];
    }

    abstract String getPrefix();
}

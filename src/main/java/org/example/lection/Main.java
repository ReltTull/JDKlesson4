package org.example.lection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Qd", "Dd", "Vv", "Zz"};
        for (String string : strings) {
            System.out.print(string + " ");
        }
        swapElements(strings, 1, 2);
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }

    /**
     * Задание 1 - метод, менящий местами два элемента массива любых ссылочных типов посредством временной переменной
     * temp обобщенного типа.
     * @param inputArray
     * @param indexToSwap1
     * @param indexToSwap2
     * @param <T>
     */
    public static <T> void swapElements(T[] inputArray, int indexToSwap1, int indexToSwap2) {
            T temp = inputArray[indexToSwap1];
            inputArray[indexToSwap1] = inputArray[indexToSwap2];
            inputArray[indexToSwap2] = temp;
    }
}

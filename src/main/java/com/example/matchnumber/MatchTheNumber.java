package com.example.matchnumber;

import java.util.Arrays;

public class MatchTheNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 81, 43, 12, 34, 26, 38, 5, 76, -51, 34, 0, 234};
        System.out.println("Dizi : " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sıralı : " + Arrays.toString(numbers));

        int counter = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                int evenNumber = numbers[i];
                if (evenNumber % 2 == 0) {
                    counter++;
                    System.out.print(evenNumber + " ");
                }
            }
        }
        if (counter == 0) {
            System.out.println("Kurala uygun çift sayı yok.");
        }
    }
}

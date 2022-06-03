package org.main_tasks;

import java.util.Random;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want to be generated?");
        int input_number = scanner.nextInt();
        int[] numbers = new int[input_number];

        for (int i = 0; i < input_number; i++ ){
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < input_number; i++ ){
            System.out.print(numbers[i] + " ");
        }
    }
}

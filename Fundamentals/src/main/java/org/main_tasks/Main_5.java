package org.main_tasks;

import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
        int number= 0;
        do {
            System.out.println("Enter number from 1 to 12");
            number = scanner.nextInt();
        } while((number < 1) || (number > 12));
        System.out.println(months[number - 1]);
    }
}

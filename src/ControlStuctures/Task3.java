package ControlStuctures;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter our number: ");
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            if (number == 0) {
                System.out.println("Entered number is neutral");
            } else {
                System.out.println("Entered number is even");
            }
        } else {
            System.out.println("Entered number is odd");
        }
    }
}

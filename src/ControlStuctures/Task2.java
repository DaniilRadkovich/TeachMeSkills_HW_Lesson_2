package ControlStuctures;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your month number: ");
        int month = sc.nextInt();
        sc.close();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Choose 1-12 numbers!");
        }
    }
}

package ControlStuctures;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter outdoor temperature: ");
        int temp = sc.nextInt();
        sc.close();
        if (temp > 5)
            System.out.println("Warm");
        if (temp <= -5 && temp > -20)
            System.out.println("Normal");
        if (temp <= -20)
            System.out.println("Cold");
    }
}

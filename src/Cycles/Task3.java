package Cycles;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        sc.close();
        int result = 0;

        for (int i = 0; i <= num; i++) {
            result = result + i;
        }
        System.out.println(result);
    }
}

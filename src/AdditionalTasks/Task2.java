package AdditionalTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        float sum = sc.nextFloat();
        System.out.println("Enter number of months: ");
        int numberMonths = sc.nextInt();
        sc.close();
        float balance = sum;

        for (int i = 1; i <= numberMonths; i++) {
            balance = (float) (balance + balance * 0.07);
        }
        System.out.println("Your balance: " + balance);
    }
}

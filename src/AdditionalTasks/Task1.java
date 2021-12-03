package AdditionalTasks;

public class Task1 {
    public static void main(String[] args) {
        int result = 0;
        int first = 0;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");

        for (int i = 0; i <= 8; i++) {
            result = first + second;
            System.out.print(result + " ");
            first = second;
            second = result;
        }
    }
}

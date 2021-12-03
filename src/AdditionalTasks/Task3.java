package AdditionalTasks;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1, j = 0; i <= 10; ) {
            System.out.println(i + "*" + j + "=" + i * j);
            j++;
            if (j == 11) {
                i++;
                j = 0;
                System.out.println("--------");
            }
        }
    }
}

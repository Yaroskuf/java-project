import java.util.Scanner;

public class Третья {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество значений в массиве: ");
        int y = scanner.nextInt();

        if (y <= 0) {
            System.out.println("Значение должно быть больше нуля");
            return;
        }

        int[] m = new int[y];

        for (int i = 0; i < y; i++) {
            System.out.print((i + 1) + ": ");
            m[i] = scanner.nextInt();
        }

        String z;
        for (int j = 0; j < y; j++) {
            if (m[j] == 0) {
                z = "False";
                System.out.println(z);
                break;
            } else {
                z = "True";
                System.out.println(z);
                break;
            }
        }

        scanner.close();
    }
}

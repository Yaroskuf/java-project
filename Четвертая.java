import java.util.Scanner;

public class Четвертая {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int y = scanner.nextInt();

        if (y <= 0) {
            System.out.println("Длина массива должна быть больше 0");
            return;
        }

        int[] m = new int[y];
        int k = 0;

        for (int i = 0; i < y; i++) {
            System.out.print(i+1 + ": ");
            m[i] = scanner.nextInt();
        }

        for (int j = 0; j < y; j++) {
            if (m[j]-1 == j) {
                k += m[j];
            }
        }

        if (k != 0) {
            System.out.println("Сумма: " + k);
        } else {
            System.out.println("Таких элементов нет");
        }

        scanner.close();
    }
}
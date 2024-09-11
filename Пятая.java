import java.util.Scanner;

public class Пятая {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Строки: ");
        int y = scanner.nextInt();

        System.out.print("Столбцы: ");
        int x = scanner.nextInt();

        if (x <= 0 || y <= 0) {
            System.out.println("Значения должны быть больше 0");
            return;
        }

        int[][] m = new int[y][x];
        int k = 0;
        int no = 0;
        float srz = 0.0f, ma = 0.0f;

        // Ввод элементов массива
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print((i + 1) + "." + (j + 1) + ": ");
                m[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // Вывод элементов массива
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Подсчет строки с максимальным средним значением
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                srz += m[i][j];
                k++;
                if (k >= x) {
                    float avg = srz / x;
                    ma = Math.max(avg, ma);
                    if (ma <= avg) {
                        no = i + 1;
                    }
                    k = 0;
                    srz = 0;
                }
            }
        }

        System.out.println("Строка: " + no + " Среднее значение: " + ma);
        scanner.close();
    }
}
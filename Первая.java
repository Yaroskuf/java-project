import java.util.Scanner;

public class Первая {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первая сторона: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ВВЕДИТЕ ЧИСЛО!!!");
            return;
        }
        int a = scanner.nextInt();

        System.out.print("Вторая сторона: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ВВЕДИТЕ ЧИСЛО!!!");
            return;
        }
        int b = scanner.nextInt();

        System.out.print("Третья сторона: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ВВЕДИТЕ ЧИСЛО!!!");
            return;
        }
        int c = scanner.nextInt();

        // Проверка на положительные значения и возможность построить треугольник
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Треугольник можно построить");
            } else {
                System.out.println("Треугольник нельзя построить");
            }
        } else {
            System.out.println("Значения должны быть больше 0");
        }

        scanner.close();
    }
}
import java.util.Scanner;
public class Первая {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первая сторона: ");
        int a = scanner.nextInt();
        System.out.print("Вторая сторона: ");
        int b = scanner.nextInt();
        System.out.print("Третья сторона: ");
        int c = scanner.nextInt();
    if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Треугольник можно построить");
            }
                else {
                System.out.println("Треугольник нельзя построить");
                }
    }
                else {
                System.out.println("Значения должны быть больше 0");
                }

        scanner.close();
    }
}
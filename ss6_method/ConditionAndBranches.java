package ss6_method;

import java.util.Scanner;

public class ConditionAndBranches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ky tu: ");
        char c = scanner.next().charAt(0);

        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double cc = scanner.nextDouble();

        System.out.println("Ky tu " + c + " sang thuong la " + toLowerCase(c));

        levelOne(a, b);
        levelTwo(a, b, cc);

        System.out.println("Gia tri nho nhat la: " + min(3, 6, 4, 7));
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        } else {
            c -= 32;
        }
        return c;
    }

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT VO SO NGHIEM");
            } else {
                System.out.println("PT VO NGHIEM");
            }
        } else {
            System.out.println("PT CO 1 NGHIEM " + -b / a);
        }
    }

    public static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            levelOne(b, c);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("PT VO NGHIEM");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("PT co nghiem duy nhat la " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem cua pt la x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }

    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;
    }
}

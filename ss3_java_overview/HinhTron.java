package ss3_java_overview;

import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double r = scanner.nextDouble();
        double C = 2 * Math.PI * r;
        double A = Math.PI * r * r;

        System.out.println("Chu vi: " + C);
        System.out.println("Dien tich: " + A);
    }
}

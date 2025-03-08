package ss4_condition;

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong: ");
        int x = scanner.nextInt();

        double squareRoot = Math.sqrt(x);

        if (squareRoot % 1 == 0) {
            System.out.println(x + " la so chinh phuong");
        }else {
            System.out.println(x + " khong phai la so chinh phuong");
        }
    }
}

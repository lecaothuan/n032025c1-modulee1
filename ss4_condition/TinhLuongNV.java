package ss4_condition;

import java.util.Scanner;

public class TinhLuongNV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap TNCT: ");
        int n = scanner.nextInt();

        double luongCanBan = 650000;
        double heSoLuong;
        if (n < 12) {
            heSoLuong = 1.92;
        } else if (n < 36) {
            heSoLuong = 2.34;
        } else if (n < 60) {
            heSoLuong = 3;
        } else {
            heSoLuong = 4.5;
        }

        double luong = heSoLuong * luongCanBan;

        System.out.println("Luong cua nhan vien la: " + luong);
    }
}

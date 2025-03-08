package ss4_condition;

import java.util.Scanner;

public class DoiKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ky tu chu cai: ");
        char c = scanner.next().charAt(0);

        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            if (c >= 'a' && c <= 'z') {
                c -= 32;
            } else {
                c += 32;
            }
            System.out.println("Ky tu sau khi doi: " + c);
        } else {
            System.out.println("Ban da nhap sai");
        }
    }
}

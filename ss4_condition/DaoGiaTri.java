package ss4_condition;

import java.util.Scanner;

public class DaoGiaTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Gia tri moi cua a va b: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}

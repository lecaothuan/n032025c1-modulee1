package ss4_condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tu 1 - 10: ");
        int n = scanner.nextInt();

        if(n == 1){
            System.out.println("one");
        } else if (n == 2) {
            System.out.println("two");
        } else if (n == 3) {
            System.out.println("three");
        } else if (n == 4) {
            System.out.println("four");
        } else if (n == 5) {
            System.out.println("five");
        } else if (n == 6) {
            System.out.println("Six");
        } else if (n == 7) {
            System.out.println("seven");
        } else if (n == 8) {
            System.out.println("eight");
        } else if (n == 9) {
            System.out.println("nine");
        } else if (n == 10) {
            System.out.println("ten");
        }else System.out.println("so khong hop le");


    }
}

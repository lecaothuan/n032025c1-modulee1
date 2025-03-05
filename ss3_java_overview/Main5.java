package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int a= 2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap tuoi cua ban: ");
        int age = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        System.out.print("nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.println("tuoi cua ban la:" + age);
        System.out.println("ten cua ban la: " + name);




    }
}

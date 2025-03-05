package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap nam sinh: ");
        int namSinh = Integer.parseInt(scanner.nextLine());
        int age = Year.now().getValue() - namSinh;
        System.out.println("Tuoi cua ban la: " + age);

    }
}

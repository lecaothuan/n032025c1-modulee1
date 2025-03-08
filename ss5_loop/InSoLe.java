package ss5_loop;

import java.util.Scanner;

public class InSoLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                System.out.print(i + " ");
        }
    }
}

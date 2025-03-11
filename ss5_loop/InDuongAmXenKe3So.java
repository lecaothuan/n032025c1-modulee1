package ss5_loop;

import java.util.Scanner;

public class InDuongAmXenKe3So {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n ; i += 2) {
            if (i % 3 == 0) {
                System.out.print(-i + " ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}

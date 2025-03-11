package ss5_loop;

import java.util.Scanner;

public class In2Den2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= 2 * n  ; i += 2) {
            System.out.print(i + " ");
        }
    }
}

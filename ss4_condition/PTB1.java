package ss4_condition;

import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if(b == 0){
                System.out.println("Pt vo so nghiem");
            }else {
                System.out.println("Pt vo nghiem");
            }
        }else {
            double n = -b / a;
            System.out.println("Nghiem cua pt la: " + n);
        }
    }
}

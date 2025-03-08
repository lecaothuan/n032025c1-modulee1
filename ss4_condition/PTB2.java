package ss4_condition;

import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a:" );
        double a = scanner.nextDouble();
        System.out.print("Nhap b:" );
        double b = scanner.nextDouble();
        System.out.print("Nhap c:" );
        double c = scanner.nextDouble();

        if (a == 0) {
            if(b == 0){
                if(c == 0){
                    System.out.println("PT vo so nghiem");
                }else {
                    System.out.println("PT vo nghiem");
                }
            }else {
                double n = -c / b;
                System.out.println("Nghiem cua pt la: " + n);
            }
        }else {
            double delta = b * b  - 4 * a * c;
            if (delta  < 0){
                System.out.println("PT vo nghiem");
            } else if (delta == 0 ) {
                double x = -b / (2 * a);
                System.out.println("PT co nghiem duy nhat la " + x);
            }else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem cua pt la x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }
}

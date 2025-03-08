package ss4_condition;

import java.util.Scanner;

public class XacDinhNgayCuaThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int thang = scanner.nextInt();
        System.out.print("Nhap nam ");
        int nam = scanner.nextInt();

        int soNgay;

        if (thang == 4 || thang == 6 || thang == 9 || thang ==11 ) {
            soNgay = 30;
        } else if (thang == 2) {
            if (nam % 4 == 0 && nam % 100 !=0 || nam % 400 == 0) {
                soNgay = 29;
            }else {
                soNgay = 28;
            }
        }else {
            soNgay = 31;
        }

        System.out.println("Thang " + thang + " cua nam " + nam + " co so ngay la " + soNgay );
    }
}

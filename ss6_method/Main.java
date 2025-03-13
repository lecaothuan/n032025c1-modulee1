package ss6_method;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c =4;
        callTotal(a,b);
        int total = callTotal2(a,b);
        System.out.println(callTotal2(total,c));


    }

    public static void callTotal(int a, int b) {
        int total = a + b;
        System.out.println("Total: " +total);
    }

    public static int callTotal2(int a, int b){
        int total = a + b;
        return total;
    }
}

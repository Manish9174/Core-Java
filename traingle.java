import java.util.Scanner;

class traingle {
    public static void main(String str[]) {
        int j, y, rows, k = 1;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Rwos");
        rows = scr.nextInt();
        for (j = 1; j <= rows; j++) {
            for (y = 1; y <= j; y++) {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
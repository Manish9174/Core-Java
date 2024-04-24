import java.util.Scanner;

class newms {
    public static void main(String args[]) {
        int i, j, row;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the row");
        row = scr.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
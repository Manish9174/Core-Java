import java.util.Scanner;

class prime {

    public static void main(String str[]) {
        int i, n, m = 0;
        System.out.println("Enter a digit");
        Scanner scr = new Scanner(System.in);
        n = scr.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                m++;
            }
        }

        if (m == 2) {
            System.out.println("Is Prime Number");
        }

        else {
            System.out.println("Is not prime number");
        }
    }
}
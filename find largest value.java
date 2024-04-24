import java.util.Scanner;

class manish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest value using nested if-else statements and logical operators
        if (num1 > num2) {
            if (num2 > num3 ) {
                if (num3 > num1) {
                    
                }

            } else {
            System.out.println("The largest number is: " + num3);
            }
        } else {
            System.out.println("You are a minor.");
        }

        scanner.close();

    }
}

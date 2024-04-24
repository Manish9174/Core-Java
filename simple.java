import java.util.Scanner;
class simple{
    public static void main(String str[]){
        Scanner scr=new Scanner(System.in);
        int simple, p, r,t;
        System.out.println("Enter value for simple interest");
        p=scr.nextInt();
        r=scr.nextInt();
        t=scr.nextInt();
        simple = (p*r*t)/100;
        System.out.println("Simple interes is : " + simple);
    }
}

import java.util.Scanner;

class areams {

    public static void main(String str[])
    {
        int are, he, we;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Heigh : ");
        he=scr.nextInt();
        System.out.println("Enter Width : ");
        we = scr.nextInt();
        are = he*we;
        System.out.println("Area is " + are);
    }
}
import java.util.Scanner;
class circum {

    public static void main(String str[]){

        double circums,area;
        int radius;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius=scr.nextInt();
        area=Math.PI*(radius*radius);
        System.out.println("The are of circle is : " +area);
        circums=Math.PI*2*radius;
        System.out.println("Circumference is " +circums);
    }
}
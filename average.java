import java.util.Scanner;

class average{
        public static void main(String str[]){

    Scanner scr=new Scanner(System.in);
        int maths, science, eco, business, finance;
        float total, perc, ave;

        System.out.println("Enter 5 subjects number : ");
        maths=scr.nextInt();
        science=scr.nextInt();
        eco=scr.nextInt();
        business=scr.nextInt();
        finance=scr.nextInt();
        total = maths + science + eco + business + finance;
        ave = total/5;
        perc = (total/(5*100))*100;
        System.out.println("Total of subjects : "+ total);
        System.out.println("Average of tottal subjects : " + ave);
        System.out.println("Perecentage of tottal subjects : " + perc);        
    }
}
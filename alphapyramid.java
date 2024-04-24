import java.util.Scanner;
class alphabates {
    public static void main(String atr[])
    {
        int k,d,row;
        char ch='A';
        Scanner scr = new Scanner(System.in);
        System.out.println("enter row");
        row = scr.nextInt();
        for(k=1;k<=row;k++){
            ch = 'A';
            for(d=1;d<=k;d++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }        
    }
}
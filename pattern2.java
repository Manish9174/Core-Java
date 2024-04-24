import java.util.Scanner;
class pattern2{
    public static void main(String str[]){
        int i,j,rowms;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Row");
        rowms = scr.nextInt();
        for(i=1;i<=rowms;i++){
            for(j=1;j<=i;j++){
                System.out.print("simi");
            }
            System.out.println();
        }
    }
}
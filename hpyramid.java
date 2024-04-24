import java.util.Scanner;
class pyramid{
    public static void main(String str[]){
            int m, s, simi;
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter row for pyramid");
            simi = scr.nextInt();
            for(m=1;m<=simi;m++){
                for(s=1;s<=m;s++){
                    System.out.print(m);
                }
                System.out.println();
            }           
    }
}
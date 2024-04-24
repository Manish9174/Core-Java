class axcep {

    public static void main(String str[]){
        int i, a=40,b=4,c;
    try{
        for(i=0;i<10;i++){

            c=a/b;
            System.out.println(c);
            b--;
        }
    }catch(ArithmeticException ms){
        System.out.println("Catch working");
    }
    System.out.println("Hello Manish");
}
 }
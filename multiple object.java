class multiobj {

    int new1;
    String new2;
}

class multimain{
    public static void main(String str[]){
        multiobj d1=new multiobj();
        multiobj d2=new multiobj();
        d1.new1=100;
        d1.new2="manish";
        d2.new1=500;
        d2.new2="ram";
        System.out.println(d1.new1+" "+d1.new2);
        System.out.println(d2.new1+" "+d2.new2);
    }
}
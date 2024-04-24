class jsss
{
   final int x=9000;
    void m1()
    {
         //x=x+12000; // error
        System.out.println("x= "+x);
    }

    public static void main(String str[])
    {
        jsss d1=new jsss();
        d1.m1();    
    }    
}
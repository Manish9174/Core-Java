class A
 {}
class B 
{}
class D{
 public static void main(String str[]){
    A a1=new A();
    System.out.println(a1 instanceof B);
    System.out.println(a1 instanceof object);
    System.out.println(a1 instanceof A);
    //System.out.println(a1 instanceof D);
 }
   
}


class referobj {
    int id;  
    String name;  
}

class mainsd{
    public static void main(String str[]){
        referobj f1=new referobj();
        f1.id=100;
        f1.name="sonoo";
        System.out.println(f1.id+""+f1.name);
    }
}
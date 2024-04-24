class singleinher{
    void mss(){
        System.out.println("Eating");
    }
}

class inheri extends singleinher{
 void mss(){
    System.out.println("drinking");
 }
}

class inherit {
    public static void main(String[] args) {
        inheri k;
        k=new inheri();
        k.mss();
        k.mss();
    }
}
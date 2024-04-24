class inher{
    void eat(){
        System.out.println("eating");
    }
}

class dogg extends inher{
    void rrr(){
        System.out.println("eating fruits");
    }
}

class babydog extends inher {
    void eat(){
        System.out.println("drinking milk");
    }

    public static void main(String[] args) {
        inher a,b,c;
        a=new inher();
        b=new dogg();
        c=new babydog();
        a.eat();
        b.eat();
        c.eat();
    }


}

class singleinher{

    void jjj(){
        System.out.println("manishhh");
    }
}

class testinher extends singleinher{
    void jjj(){
        System.out.println("jayesss");
    }
}

class mainnn{
    public static void main(String[] args) {
        singleinher dd=new singleinher();
        dd.jjj();
    }
}
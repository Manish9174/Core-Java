class multiobj {
    
    int length;
    int width;
    void multobj(int m, int n){
        length=m;
        width=n;
    }

    void calculatearea(){
        System.out.println(length*width);
    }
}

class test{
    public static void main(String[] args) {
        multiobj d1=new multiobj(), d2=new multiobj();// creating multiobject
        
        d1.multobj(10, 5);
        d2.multobj(15,25);
    }
}
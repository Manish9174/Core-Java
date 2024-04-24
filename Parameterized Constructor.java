//Java Program to demonstrate the use of the parameterized constructor.  
class paramet{

int id;
String nn;
 
//creating a parameterized constructor  
paramet(int s, String kk){
    id = s;
    nn = kk;
}

    //method to display the values  
    void disp(){
        System.out.println(id+" "+nn);
    }

    public static void main(String[] args) {        
       //creating objects and passing values  
       paramet gg=new paramet(115, "manish");
       paramet hh=new paramet(110, "jayesh");

    //calling method to display the values of object  
       gg.disp();
       hh.disp();
    }

}
//Java program to overload constructors  
class overload {

    int id;
    String name;
    int age;

    // creating two arg constructor
    overload(int n, String s) {
        id = n;
        name = s;
       
    }

    // creating three arg constructor
    overload(int a, String t, int e){
        id = a;
        name = t;
        age = e;
    }

    void mainms(){
        System.out.println(id+""+name+""+age);        
    }

    public static void main(String[] args) {
        
        overload dd=new overload(111, "manish", 25);
        overload d1=new overload(14, "jayesh", 26);
        dd.mainms();
        d1.mainms();
        
    }


}

// Note : Constructor overloading in Java is a technique of having more than one
// constructor with different parameter lists. They are arranged in a way that
// each constructor performs a different task. They are differentiated by the
// compiler by the number of parameters in the list and their types.
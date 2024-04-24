class defau {

    int m = 1;
    String s = "manish";

    // method to display the value of id and name
    void disp() {
        System.out.println(m + s);
    }

    public static void main(String args[]) {
        // creating objects
        defau dd = new defau();
        defau ff = new defau();

        // displaying values of the object
        dd.disp();
        ff.disp();

    }

}
// Explanation:In the above class,you are not creating any constructor so
// compiler provides you a default constructor. Here 0 and null values are
// provided by default constructor.
class instancedemo {

    // declaring instance variable
    public String manish; // public instance
    double divison;// default instance
    private String agems; // private instance

    // constructor that initialize an intance varibale
    public instancedemo(String ms) {
        manish = ms;
    }

    // method initialize an instance variable
    public void newfunc(double d) {
        divison = d;
    }

        // method initialize an instance variable
        public void secfunf(String age){
            agems=age;
        }

        /* Method to display the values of instance variables. */  
        public void displ(){
            System.out.println("St name "+manish);
            System.out.println("student division :"+divison);
            System.out.println("Student Age: " + agems);  
                }

                public static void main(String[] args) {
                    instancedemo s1=new instancedemo("manish");
                    s1.secfunf("24");
                    s1.newfunc(123.2);
                    s1.displ();             
                }
            }




    
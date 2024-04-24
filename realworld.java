class account{

    int accno;
    String name;
    float amount;

    //method to initialized object
    void insert(int a, String n, float amt){
        accno=a;
        name=n;
        amount=amt;
    }

    //deposit method
    void depo(float amt){
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw(){
                
    }

}
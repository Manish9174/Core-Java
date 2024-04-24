class newone {    
    void factms(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);  
    }
}
class runc {
    public static void main(String[] args) {
      new newone().factms(5);
    }
}
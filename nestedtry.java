class nestedtry {
    
    public static void main(String str[]){

        int i,j,a=40,b=0,c;
        for (i=0;i<10;i++){
            try{
                try{
                    for(j=0;j<10;j++){
                        if(i==j){
                            c=a/b;
                            System.out.println(c);
                        }
                        System.out.println(i);
                    }
                }catch(ArithmeticException ms){
                                 i++;       
                }finally{
                    i++;
                }
            }catch(Exception rr){
                i++;
            }finally{
                i++;
            }
        }
    }
}

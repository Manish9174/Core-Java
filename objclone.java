class objclone implements Cloneable {

    int rollno;
    String name;
     objclone(int ms, String ns){
        rollno=ms;
       name=ns;
     }    

      public Object clone()throws CloneNotSupportedException{
        return super.clone();
     }

     public static void main(String[] args) {
        try{

            objclone s1=new objclone(101, "manish");

            objclone s2=(objclone)s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(Exception hh){
            System.out.println(hh);
        }
     }
}

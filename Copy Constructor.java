class copy{
int id;
String name;
int age;

copy(int n, String h, int k){
    
    id = n;
    name = h;
    age = k;
}

copy(copy oss){
    id = oss.id;
    name = oss.name;  
    age = oss.age;
}

void msss(){
  System.out.println(id+" "+name+" "+age);
}

public static void main(String[] args) {
    
    copy ff=new copy(112,"shiva",114);
    copy gg=new copy(ff);
    ff.msss();
    gg.msss();

}

}   
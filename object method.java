class objmeth {
    int newsh;
    String newsg;
    void demometh(int rr, String ms){
        newsh = rr;
        newsg = ms;
    }

    void hellomet(){
        System.out.println(newsh+""+newsg);
    }
}

class newmainms{
    public static void main(String[] args) {
        objmeth d1=new objmeth();
        objmeth d2=new objmeth();
        d1.demometh(15,"shiv");
        d2.demometh(12,"naryan");
        d1.hellomet();
        d2.hellomet();
    }
}
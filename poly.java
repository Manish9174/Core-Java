class datamember{

    int neeew = 100;

}

class datams extends datamember {
    int neeew = 150;
    public static void main(String[] args) {

        datamember hh=new datams();
        System.out.println(hh.neeew);
    }
}
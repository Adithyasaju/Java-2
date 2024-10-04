class TestOne {
    public static void main(String[] args) {
        String ename="Rahul";
        ename.concat("Gandhi");
        System.out.println(ename);                  //String are immutable    //Rahul
    }
}

class Test{
    public static void main(String[] args) {
        StringBuffer ename = new StringBuffer("Rahul");
        ename.append("Gandhi");                   
        System.out.println(ename);                              //mutable    //RahulGandhi
    } 
}

class TestTwo{
    public static void main(String[] args) {
    String ename="Rahul";
    ename=ename.concat("Gandhi");
    System.out.println(ename);                                //mutable    //RahulGandhi
    }
}

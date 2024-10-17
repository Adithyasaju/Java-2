//String to Object 

class Test2{
    public static void main(String[] args) {
        String s1="100";
        String s2="100.5";
        Integer a=Integer.valueOf(s1);
        Double d=Double.valueOf(s2);
        System.out.println(a);
        System.out.println(d);

    }
}


//Object to String
class Test{
    public static void main(String[] args) {
        Integer a=100;    //Autoboxing
        Double b=200.20;
        //String s1=a.toString();
        //String s2=b.toString();
        System.out.println(a.toString());
        System.out.println(b.toString());
       // System.out.println(s1);
        //System.out.println(s2);
    }
}

class Seven {                                             //StackOverflowError
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        m1();
    }
}

class Test{
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        m3();
    }
    public static void m3(){
        m1();
    }
}

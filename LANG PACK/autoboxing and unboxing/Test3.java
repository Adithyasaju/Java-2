//String to primirtive
class Test3 {
    public static void main(String[] args) {
        //int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        //System.out.println(sum);
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float sum = a+b;
        System.out.println(sum);
    }
    
}


//primitive to String

class Test{
    public static void main(String[] args) {
    int a=100;
    float b=200.2f;
    String s1=Integer.toString(a);
    String s2=Float.toString(b);
    System.out.println(s1);
    System.out.println(s2);
    }
}

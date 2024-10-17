 class Test4 {
    public static void main(String[] args) {
        int a=10;
        Integer i=a;   //Autoboxing
        Integer i1=Integer.valueOf(a); //converting manually instead of autoboxing   primitive to object
        String s1=i.toString();        //object to string
        int b= Integer.parseInt(s1);   //string to primitive
        int c= i.intValue();           //object to primitive

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(i);
        System.out.println(s1);
    }
    
}

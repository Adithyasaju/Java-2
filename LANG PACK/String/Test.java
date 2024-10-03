class Test{
    public static void main(String[] args) {
        String ename1 ="Rahul";
        String ename2= new String("Rahul");
        String ename3="Rahul";
        Test a= new Test();

        System.out.println(ename1.equals(ename2));  //true             //string.equals--->reference comp
        System.out.println(ename1 == ename2);       //false

        System.out.println(ename1.equals(ename3));   //true
        System.out.println(ename1 == ename3);       //true

        System.out.println(a.equals(ename1));       //false             //obj.equals-->Content comparison
        //System.out.println(a==ename1);            //error             //it requires relation 
    }

}

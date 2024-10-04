class TestThree {
    public static void main(String[] args) {
        String ename1="Rahul";
        String ename2=new String("Rahul");
        ename1.concat("Gandhi");
        System.out.println(ename1);   //Rahul
    }
    
}

class Test {
    public static void main(String[] args) {
        String ename1="Rahul";
        String ename2=new String("Rahul");
        ename1=ename1.concat("Gandhi");
        System.out.println(ename1);   //RahulGandhi
    }
    
}

class TestOne {
    public static void main(String[] args) {
        String ename1="Rahul";
        String ename2=new String("Rahul");
        ename2=ename2.concat("Gandhi");
        System.out.println(ename2);   //RahulGandhi
    }
    
}
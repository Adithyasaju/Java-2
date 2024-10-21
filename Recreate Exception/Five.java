class Five {                                                 //classCast Exception
    public static void main(String[] args) {
        Object obj=new Object();
        String str=(String)obj;                      //unable ot convert into obj since string is a child class and cannot hold parent class
        System.out.println(str);
    }
}

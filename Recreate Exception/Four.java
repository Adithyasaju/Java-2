class Four {                                                       //NumberFormat Exception
    public static void main(String[] args) {
        int a =Integer.parseInt("Twenty");
        System.out.println(a*10);
    }
}
class Test{
    public static void main(String[] args) {
        try {
            int a =Integer.parseInt("Twenty");
            System.out.println(a*10);
        }
         catch (Exception e) {
          System.out.println(e.getMessage()); 
          System.err.println(e.getClass());            //to get exception name
        }
    }
}

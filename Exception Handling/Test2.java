class Test2  {
    public static void main(String[] args) {
        String ename=null;
        System.out.println(ename.length());             //NullPointerException
        System.out.println("GM");

     }
}

class Test  {
    public static void main(String[] args) {
        //String ename="Rahul";
        String ename=null;
        try {
        System.out.println(ename.length()); 
        } catch (Exception e) {
          // System.out.println(e.getMessage());
        }
                  
        System.out.println("GM");

     }
}

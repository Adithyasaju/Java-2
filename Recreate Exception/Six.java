class Six {                                                               //IllegalArgumentException
    public static void main(String[] args) {
        Thread t=new Thread();
        t.setPriority(101);        //If its is from 1-10 no error,if exceeds 10 exception occurs
    }
}

class Test{
    public static void main(String[] args) {
        try {
            Thread t=new Thread();
        t.setPriority(101);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
}
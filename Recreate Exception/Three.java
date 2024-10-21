class Three {                                       //NullPointer Exception
    public static void main(String[] args) {
        String ename=null;
        System.out.println(ename.length());
    }
}

class Test{
    public static void main(String[] args) {
        String ename=null;
        try {
            System.out.println(ename.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

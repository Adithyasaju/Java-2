class Two {                                             //ArrayIndexOutOfBound Exception
    public static void main(String[] args) {
        String[] enames={"Rahul","Sona","Priya"};
        System.out.println(enames[0]);
        System.out.println(enames[5]);
        System.out.println(enames[2]);
    }
}

class Test{
    public static void main(String[] args) {
        String[] enames={"Rahul","Sona","Priya"};
        System.out.println(enames[0]);
        try {
            System.out.println(enames[5]);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        System.out.println(enames[2]);
    }
}

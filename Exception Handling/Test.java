class Test{
    public static void main(String[] args) {
        System.out.println("GM");
        System.out.println(10/0);              //Arithmetic Exception
        System.out.println("GA");
    }
}

//To handle it use try block

class Test1{
    public static void main(String[] args) {
        System.out.println("GM");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("Cant divide by Zero");
        }
        System.out.println("GA");
    }
}

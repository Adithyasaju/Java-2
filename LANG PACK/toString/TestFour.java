class B {
    public String toString(){                       //overriding toString method to get meaningful statement
        return "Rahul";
    }
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b);
        System.out.println(b.toString());
        
    }
}
 
class Test{
    public static void main(String[] args) {
        String ename=new String("Rahul");
        System.out.println(ename.toUpperCase());
        String loc="  BNG   ";
        System.out.println(loc.length());    //7
        String new_Loc=loc.trim();                          //return string value without white spaces
        System.out.println("After Trimming "+new_Loc.length());             //3

        char ch=ename.charAt(0);
        System.out.println(ch);
        int i =ename.indexOf('a');
        System.out.println(i);
    }
}

//charAt()-return char of specified index
//indexOf()-return index of specified char
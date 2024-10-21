import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Test{
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter("abc.text") ;
        }
        catch(FileNotFoundException fnFx){
            fnFx.printStackTrace();;
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}

class Test1{
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("abc.text") ;
    }
}

package FunctionalInterface;
@FunctionalInterface
interface DaoI{
    public abstract void login();
    //public  abstract  void logout();  (if try to create another method it shows errror)
}
class DaoImpl implements  DaoI{
    public void login(){
        System.out.println("Login Success");
    }
}
public class TestOne {
    public static void main(String[] args) {
        DaoI obj=new DaoImpl();
        obj.login();
    }
}

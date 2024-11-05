package FI2;
interface DaoI{
    public abstract void login();
}
public class DaoImpl implements DaoI {
    public  void login(){
        System.out.println("Login Success");
    }

    public static void main(String[] args){
        DaoI obj = new DaoImpl();
        obj.login();
    }
}

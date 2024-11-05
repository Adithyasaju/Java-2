package FI3;
@FunctionalInterface
interface DaoI{
    public abstract void login();
}
public class DaoImpl {
    public static void main (String[] args){
        DaoI obj =()->{
            System.out.println("Login Success");
        };
        obj.login();
    }
}


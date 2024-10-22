class LowBalException extends Exception {
    LowBalException(String msg){
        super(msg);
    }
    
}

class Account{
    public void withdrawl(int amount)throws LowBalException{
        //int acc_bal=50000;
        int acc_bal=500;
        if (acc_bal > amount){
            System.out.println("Balance is avliable");
        }
        else{
            throw new LowBalException("No Minimum Balance");
        }
    }
    public static void main(String[] args) throws LowBalException{
        new Account().withdrawl(500);
    }
}

 public class Access_Specifiries {
    public static void main(String arg[]){
        BankAccount myAccount = new BankAccount("xyz");
        BankAccount myAccount = new BankAccount(123);
        myAccount.userName = "shrawan";
        System.out.println( "User name is :" +myAccount.userName);
        myAccount.setPassword("abc");
        System.out.println( "user password is :" + myAccount.getPassword());
        System.out.println(myAccount.roll);
    }
}

class BankAccount{
    String userName;
     private String password;
     int roll;
   public void setPassword(String pwd){
        password = pwd;
    }
BankAccount(String pwsd){
    this.password = pwsd;
}
BankAccount(int roll){
    this.roll = roll;
}

    public String getPassword(){
        return this.password;
    }
   
}
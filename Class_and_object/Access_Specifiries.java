
 public class Access_Specifiries {
    public static void main(String arg[]){
        BankAccount myAccount = new BankAccount();
        myAccount.userName = "shrawan";
        System.out.println( "User name is :" +myAccount.userName);
        myAccount.setPassword("abc");
        System.out.println( "user password is :" + myAccount.getPassword());
    }
}

class BankAccount{
    String userName;
     private String password;
   public void setPassword(String pwd){
        password = pwd;
    }
    public String getPassword(){
        return this.password;
    }
    
}
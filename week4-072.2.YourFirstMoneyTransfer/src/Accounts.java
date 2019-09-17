
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }

}

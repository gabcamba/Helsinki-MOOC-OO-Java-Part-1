
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);
        transfer(a, b, 50);
        transfer(b, c, 25);
        
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
    }
    
    public static void transfer(Account a, Account b, double howMuch)
    {
        a.withdrawal(howMuch);
        b.deposit(howMuch);
    }


}

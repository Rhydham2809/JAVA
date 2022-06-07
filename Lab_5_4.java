import java.util.Scanner;
class Bank_Account
{
    long    account_no;
    String  username;
    String  email;
    String  accountType;
    double  accountBalance;
    Scanner input = new Scanner(System.in);

    public void getAccountDetails()
    {
        System.out.print("ACCOUNT NO :");
        account_no = input.nextLong();
        System.out.println("USERNAME :");
        username = input.next();
        System.out.println("EMAIL :");
        email = input.next();
        System.out.println("ACCOUNT TYPE : ");
        accountType = input.next();
        System.out.println("ACCOUNT BALANCE : ");
        accountBalance = input.nextDouble();
    }
     public void displayAccountDetails()
     {
         System.out.print("ACCOUNT NO :"+account_no);
         System.out.println("USERNAME :"+username);
         System.out.println("EMAIL :"+email);
         System.out.println("ACCOUNT TYPE : "+accountType);
         System.out.println("ACCOUNT BALANCE : "+accountBalance);
     }
}

public class Lab_5_4
{
    public static void main(String[] args)
    {
        Bank_Account ba = new Bank_Account();
        ba.getAccountDetails();
        ba.displayAccountDetails();
    }
}
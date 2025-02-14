import java.util.Scanner;

class Bank
{
    private int Pin=1234;
    private int bal=50000;
    Scanner scan = new Scanner(System.in);
    void check()
    {
        System.out.println("Code By Aaroh Gaur(22BCS17238)");
        System.out.print("Enter you Pin : " );
        int PinCheck= scan.nextInt();
        try
        {
            if(Pin!=PinCheck)
            {
                throw new ArithmeticException("Error : Pin Invalid");
            }
            else
            {
                withdraw();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    void withdraw()
    {
        System.out.print("Enter Amount to Withdraw : " );
        int withdraw=scan.nextInt();
        try
        {
            if(withdraw>bal)
                throw new ArithmeticException("Error: Insufficient balance");
            else
            {
                bal=bal-withdraw;
                System.out.println("Withdrawal Successfull!!" );
            }
        }
        catch(ArithmeticException f)
        {
            System.out.println(f);
        }
        finally
        {
            System.out.println("Current Balance is: "+bal);
        }
    }
}

public class ATMWithdrawal
{
    public static void main(String[] args) 
    {
        Bank b = new Bank();
        b.check();
    }
}
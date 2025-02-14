import java.util.Scanner;

public class SquareRootCalculator
{
    int n;
    SquareRootCalculator()
    {
        System.out.println("Code By Aaroh Gaur(22BCS17238)");
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        try
        {
            if(n<0)
                throw new ArithmeticException("Error: Cannot calculate the square root of a negative number");
            else
                System.out.println(n*n);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        SquareRootCalculator s = new SquareRootCalculator();
    }
}
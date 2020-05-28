import java.util.Scanner;
public class Sum_Odd_Even 
{
    private static Scanner sc;
    public static void main(String[] args) 
    {
    int number1, number2,sum;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextInt();	
		
		System.out.print(" \nPlease Enter the Second Number : ");
		number2 = sc.nextInt();
		sum=number1+number2;
        if(sum % 2 == 0)
            System.out.println("\nSum of the two numbers " + sum + " is even");
        else
            System.out.println("\nSum of the two numbers " + sum + " is odd");
    }
}

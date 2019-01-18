import java.util.Scanner;

/**
 * 
 * @author Hady Diab
 *
 */
public class FunctionIntegerReturn
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter in a number: ");
		int scannum1= scan.nextInt();
		System.out.println("Please enter in another number: ");
		int scannum2= scan.nextInt();
		System.out.println("Please enter in another number: ");
		int scannum3= scan.nextInt();
		scan.nextLine();
		integerreturn(scannum1, scannum2, scannum3);
		
		
		
		

	}

	
	public  static void integerreturn(int num1, int num2, int num3)
	{
	
		if(num1 < num2 && num1 < num3)
		{
			System.out.println(num1+" is the smallest of the three numbers.");
		}
		else if(num2 < num3 && num2 < num1)
		{
			System.out.println(num2+" is the smallest of the three numbers.");
		}
		else if(num3 < num1 && num3 < num2)
		{
			System.out.println(num3+" is the smallest of the three numbers.");
		}
		
	}
}

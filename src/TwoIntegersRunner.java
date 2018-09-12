import java.util.Scanner;
public class TwoIntegersRunner 
{
	public static void main (String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a integer:");
	int value1 = input.nextInt();
	System.out.print("Enter another integer:");
	int value2  = input.nextInt();
	TwoIntegers twoIntegers = new TwoIntegers(value1, value2);
	
	String arithmetic = twoIntegers.arithmetic();
	System.out.print(arithmetic);
	
	String larger = twoIntegers.larger();
	System.out.print(larger);
	
	boolean isEven = twoIntegers.isEven();
	System.out.print("The sum is even: " + isEven + ".");
	
	boolean Multiple = twoIntegers.Multiple();
	System.out.print("The integer is a multiple of the other number: " + Multiple + ".");
	}
}

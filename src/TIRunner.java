import java.util.Scanner;

public class TIRunner 
{
	private static Scanner input;

	public static void main(String[] args)
	{ 
		input = new Scanner(System.in);
		
		int firstnum;
		int secondnum;
		
		System.out.print("Enter an integer: ");
		firstnum = input.nextInt();
		
		System.out.print("Enter another integer: ");
		secondnum = input.nextInt();
		
		Twointegers value = new Twointegers(firstnum, secondnum);
		
		String operations = value.arithmetic();
		int big = value.larger();
		boolean even = value.isEven();
		boolean factor = value.isMultiple();
		
		System.out.println(operations);
		System.out.println(big + " is the larger of the two integers.");
		System.out.println("Is the sum of the two integers even? " + even);
		System.out.println("Is " + firstnum + " a multiple of " + secondnum + "? " + factor);
		
	}
}

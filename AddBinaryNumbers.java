import java.util.Scanner;
public class AddBinaryNumbers {
	public static void main(String[] args)
	{
		//Two variables to hold two input binary numbers
		long b1, b2;
		int i = 0, carry = 0;
		
		//This is to hold the output binary number
		int[] sum = new int[10];
		
		//To read the input binary numbers entered by the user
		Scanner scanner = new Scanner(System.in);
		
		//getting the first binary number from user
		System.out.print("Enter the first binary number: ");
		b1 = scanner.nextLong();
		//getting the second binary number from user
		System.out.print("Enter second binary number: ");
		b2 = scanner.nextLong();
		
		//closing scanner after use to avoid memory leak
		scanner.close();
		while (b1 != 0 || b2 != 0);
	}

}

package ryan1;

import java.util.Scanner;

public class FibMaven {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter term for Fibonacci sequence: ");
		
		int input1 = input.nextInt();
		
		input.nextLine();
		
		System.out.println("The " + input1 + " term of the Fibonacci sequence is " + fibRecursionMethod(input1) + ".");

	}
	
/**
 * This method serves as a way to return the nth term in the Fibonacci sequence.
 * @param fibNum an integer passed into the method to determine that terms value in the Fibonacci sequence 
 * @return		 the terms value in the Fibonacci sequence that corresponds to the fibNum integer
 */
    static int fibRecursionMethod(int  fibNum) 
    {
        if ((fibNum == 1) || (fibNum == 0)) 
        {
            return fibNum;
        }
        return fibRecursionMethod(fibNum - 1) + fibRecursionMethod(fibNum - 2);
    }
}

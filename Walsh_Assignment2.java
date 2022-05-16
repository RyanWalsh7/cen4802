//Author Name: Ryan Walsh
//Date: 05/16/2022
//Program Name: Walsh_Assignment2
import java.util.*;

public class Walsh_Assignment2
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter term for Fibonacci sequence: ");
		
		int input1 = input.nextInt();
		
		input.nextLine();
		
		System.out.println("The " + input1 + " term of the Fibonacci sequence is " + fibRecursionMethod(input1) + ".");

	}
	

    static int fibRecursionMethod(int  fibNum) 
    {
        if ((fibNum == 1) || (fibNum == 0)) 
        {
            return fibNum;
        }
        return fibRecursionMethod(fibNum - 1) + fibRecursionMethod(fibNum - 2);
    }

}

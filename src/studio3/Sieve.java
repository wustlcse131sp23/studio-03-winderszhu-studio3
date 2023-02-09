package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the max number: ");
		int max = in.nextInt();
		
		boolean [] arraySieve = new boolean [max+1];
		
		for (int i = 0; i < max+1; i++)
		{
			arraySieve[i] = true;
		}
		
		for (int j = 2; j < Math.sqrt(max); j++)
		{
			if (arraySieve[j] == true)
			{
				for (int l = j*j; l < max; l = l+j)
				{
					arraySieve[l] = false;
				}
			}
		}
		
		for (int k = 2; k < max+1; k++)
		{
			if (arraySieve[k] == true)
			{
				System.out.print(k + " ");
			}
		}
	}

}

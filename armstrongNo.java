package second;

import java.util.Scanner;

public class armstrongNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		
		for(int n = N + 1; n < Q; ++n) {
            int digits = 0;
            int result = 0;
            int originalNumber = n;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = n;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == n)
            {
                System.out.print(n + " ");
            }
		}
		sc.close();
	}

}

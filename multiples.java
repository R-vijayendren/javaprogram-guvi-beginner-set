package second;

import java.util.Scanner;

public class multiples 
{
	public static void main(String[] args) 
	{
		int a=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=5;i++)
		{
			a=n*i;
			System.out.print(a+" ");
		}
		sc.close();
		
	}

}

package second;

import java.util.Scanner;

public class primeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0,flag=0;
		temp=n/2;
		if(n==0||n==1)
		{
			System.out.println("The num is not prime...");
		}
		else
		{
		for(int i=2;i<=temp;i++)
		{
			if(n%i==0)
			{
				System.out.println("no...");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("yes...");
		}
		}
		sc.close();
	}

}

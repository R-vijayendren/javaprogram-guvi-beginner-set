package second;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r,temp,sum=0;
		temp=a;
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("yes...");
		}
		else
		{
			System.out.println("no...");
		}
		sc.close();
	}

}

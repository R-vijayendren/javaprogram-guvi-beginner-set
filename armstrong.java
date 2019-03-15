package second;

import java.util.Scanner;

public class armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,c=0,temp;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("yes..");
		}
		else
		{
			System.out.println("no..");
		}
		sc.close();
	}

}

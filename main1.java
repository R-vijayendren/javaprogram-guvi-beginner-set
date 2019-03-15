package guvi;

import java.util.Scanner;


public class main1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("The input number is positive.....");
		}
		else
		{
			if(a==0)
			{
				System.out.println("zero")
			}
			else
			{
			System.out.println("The input number is negative.....");
			}
		}
		sc.close();

	}

}

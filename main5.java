package guvi;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("the a value is greater...");
			}
			else
			{
				System.out.println("the c value is greater....");
			}
		}
		else
		{
		if(b>c)
		{
			System.out.println("the b value is greater....");
		}
		else
		{
			System.out.println("the c value is greater.....");
		}
		}
		sc.close();

	}

}

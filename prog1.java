package second;

import java.util.Scanner;

public class prog1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double value=Math.pow(a, b);
		int n=(int)value;
		System.out.println(n);
		sc.close();
	}

}

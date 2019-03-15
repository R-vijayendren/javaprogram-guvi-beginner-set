package guvi;

import java.util.Scanner;

public class main10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0)
		{
			n/=10;
			++count;
		}
		System.out.println("The count is:" +count);
		sc.close();

	}

}

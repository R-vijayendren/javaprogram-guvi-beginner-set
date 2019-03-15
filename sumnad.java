package set3;

import java.util.Scanner;

public class sumnad 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int D=sc.nextInt();
		for(int i=1;i<N;i++)
		{
			sum=sum+(A+(N-1)*D);
		}
		System.out.println(sum);
		sc.close();
	}

}

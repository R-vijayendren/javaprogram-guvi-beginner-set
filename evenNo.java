package second;

import java.util.Scanner;

public class evenNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		for(int i=N;i<=Q;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}

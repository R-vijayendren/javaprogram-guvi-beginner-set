package set3;

import java.util.Scanner;

public class maxn 
{
	public static void main(String[] args)
	{
		int max;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0;i<N;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		sc.close();
	}

}

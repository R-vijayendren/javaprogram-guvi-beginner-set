package set3;

import java.util.Scanner;

public class minn 
{
	public static void main(String[] args)
	{
		int min;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		for(int i=0;i<N;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
		sc.close();
	}

}

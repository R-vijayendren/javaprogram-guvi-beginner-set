package guvi;

import java.util.Scanner;

public class main9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int n[]=new int[N];
		for(int i=0;i<N;i++)
		{
			n[i]=sc.nextInt();
		}
		for(int j=0;j<K;j++)
		{
			sum=sum+n[j];
		}
		System.out.println(sum);
		sc.close();
	

	}

}

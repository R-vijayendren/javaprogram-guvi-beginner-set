package second;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		int flag=0;
		for(int i=N;i<=Q;i++)
		{
			for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.print(i+" ");
            }
		}
		sc.close();
		
	}

}

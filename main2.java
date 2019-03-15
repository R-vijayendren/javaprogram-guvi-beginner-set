package guvi;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		if((a%2)==0){
			System.out.println("The num is even...");
		}
		else{
			System.out.println("The num is odd...");
		}
		sc.close();
		

	}

}

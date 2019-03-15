package guvi;

import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("The character is alphabet....");
		}
		else
		{
			System.out.println("The character is not an alphabet...");
		}
		sc.close();

	}

}

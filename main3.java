package guvi;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char x=sc.next().charAt(0);
		
			if(x=='a'||x=='A'||x=='e'||x=='E'||x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U')
			{
				System.out.println("the character is vowel...");
			}
			else
			{
				System.out.println("the character is consonant...");
			}
		
			sc.close();	

	}

}

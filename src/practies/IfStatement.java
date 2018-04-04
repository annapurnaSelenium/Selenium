package practies;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) 
	{
		//Prg for checking Even Or Odd Number
		//int n=57;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Number");
		}else
		{
			System.out.println("Odd Number");
		}

	}

}

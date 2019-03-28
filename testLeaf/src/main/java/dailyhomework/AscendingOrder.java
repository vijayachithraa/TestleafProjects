package dailyhomework;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		int a,b,c,d,e;
		int cnt=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input 5 numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();		
		e = scan.nextInt();
		for(int i=0;cnt!=5;i++)
		{
			if(i==a||i==b||i==c||i==d||i==e)
			{
				
				System.out.print( i);
				cnt++;
				
			}
		}
	}

}

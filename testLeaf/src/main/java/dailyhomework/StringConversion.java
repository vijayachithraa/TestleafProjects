package dailyhomework;

import java.util.Scanner;

public class StringConversion {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("your string in");
		for(int i=0;i<str.length();i++)
		{
			int ch = str.charAt(i);
			if(ch>64&&ch<91) //forlowercase
			{
				ch = ch+32;
				System.out.print((char)ch);
			}
			else if (ch>96&&ch<123)
			{
				ch = ch-32;
				System.out.print((char)ch);
			}
			if(ch==32)
					{
				System.out.print(" ");
					}
			System.out.println();
		}
		

	}
	/* A-Z   65 - 90
	a-z    97-122
	 So capital A oda ASCII value 65 ..... 65+32 = 97*/

}

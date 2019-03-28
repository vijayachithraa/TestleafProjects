package dailyhomework;

import java.util.Scanner;

public class ReverseStringOrNumber {

	
	
	public static void reverse(String str){
		
		if(str.length()==0 || str.length()==1){
			System.out.print(str);
		}
		else{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));   	
		}
		
	}

	public static void main(String[] args) {
		reverse("654321");
		reverse("name");
		
	}

}

	/*public static void main(String[] args) {
        String str;
        
        System.out.println("Enter the string or number: ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        int num = scan.nextInt();
        scan.close();
        String reversed = reverseString(str);
        System.out.println("The reversed string is: " + reversed);
    }

    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public void reversenum()
    {
    	int num=0;
        int reversenum =0;
    	while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num%10;
            num = num/10;
        }

        System.out.println("Reverse of input number is: "+reversenum);
     }
    }
*/
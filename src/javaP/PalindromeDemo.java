package javaP;

public class PalindromeDemo {

	public static void main(String[] args) {
		String s="151";
		//int num=151;
		int num=Integer.parseInt(s);
		
		int rem=0;
		
		int sum=0;
		
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("the no is a palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}

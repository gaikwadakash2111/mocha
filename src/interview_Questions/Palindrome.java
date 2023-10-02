package interview_Questions;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=151;
		
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
			System.out.println("given no is palindrome");
		}
		else
		{
			System.out.println("given no is not a palindrome");
		}

	}

}

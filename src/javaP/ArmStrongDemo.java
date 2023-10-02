package javaP;

public class ArmStrongDemo {

	public static void main(String[] args) {
		
		int num=153;
		
		int rem=0;
		
		int results=0;
		
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			results=results+(rem*rem*rem);
		}
		if(results==temp)
		{
			System.out.println("given no is armstrong no");
		}
		else
		{
			System.out.println("given no is not an armstrong no");
		}

	}

}

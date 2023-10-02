package S;

public class Armstrong {

	//prime no= if its sum of cube of its digits
	
	public static void main(String[] args) {
		
		int num=153;
		int results=0;
		int rem=0;
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			results=results+(rem*rem*rem);
		}

		if(results==temp)
		{
			System.out.println("this is ArmStrong Number");
		}
		
		else
		{
			System.out.println("Not an ArmStrong Number");
		}
	}

}

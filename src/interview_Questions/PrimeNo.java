package interview_Questions;

public class PrimeNo {

	public static void main(String[] args) {
		
		int num=5;
		
		int temp=0;
		
		for(int i=2; i<num/2; i++)
		{
			if(num%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("prime no");
		}
		else
		{
			System.out.println("not a prime no");
		}

	}

}

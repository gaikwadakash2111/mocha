package S;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number=5;
		
		int temp=0;
		
		for(int i=2; i<number/2; i++)
		{
			if(number%i==0)
			{
				temp=temp+1;
				break;
			}
		}
		
		if(temp==0)
		{
			System.out.println("no is prime");
		}

		else
		{
			System.out.println("num is not prime");
		}
	}

}

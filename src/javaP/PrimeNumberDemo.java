package javaP;

public class PrimeNumberDemo {

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
			System.out.println("hai na bhai");
		}
		else
		{
			System.out.println("naina vo");
		}

	}

}

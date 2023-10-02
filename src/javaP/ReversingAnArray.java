package javaP;

public class ReversingAnArray {

	public static void main(String[] args) {
		
		int c[]= {2, 8, 5, 9, 0};
		
		int min=c[0];
		
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.println(c[i]);
			if(c[i]<min)
			{
				min=c[i];
			}
		}
		System.out.println();
	
		System.out.println(min);
		
		System.out.println("\n");
		
		int i=c.length-1;
		
		while(i>=0)
		{
			System.out.println(c[i]);
			i--;
		}
		
		

	}

}

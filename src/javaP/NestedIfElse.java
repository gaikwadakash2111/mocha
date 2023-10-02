package javaP;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int mark=12;
		
		if(mark>=70)
		{
			System.out.println("distinction");
		}
		else if(mark>=60 && mark<70)
		{
			System.out.println("first class");
		}
		
		else if(mark>=50 && mark<60)
		{
			System.out.println("second class");
		}
		
		else if(mark>=40 && mark<50)
		{
			System.out.println("pass class");
		}
		else
		{
			System.out.println("failed");
		}
	}

}

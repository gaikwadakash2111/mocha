package javaP;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		char c='z';
		
		switch(c)
		{
		case 'z':
			System.out.println("i am z for zebra");
			break;
			
		case 'g':
			System.out.println("i am g for goat");
			break;
			
		case 'c':
			System.out.println("i am c for cat");
			break;
			
			default:
				System.out.println("i will be there if no one matched");
		}
      System.out.println("this code belongs to main methods");
	}

}

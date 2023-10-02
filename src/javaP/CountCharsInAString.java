package javaP;

public class CountCharsInAString {

	public static void main(String[] args) {
		
		String s="thappad se dar nahi lagta saheb pyar lagta hai";

		int count = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=' ')
			{
			count++;
			}
		}
		System.out.println(count);
		
		
	}

}

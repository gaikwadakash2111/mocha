package javaP;

public class ReversingAstring {

	public static void main(String[] args) {
		
		String s="harshit";
		
		String revs="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			revs=revs+s.charAt(i);
		}
       System.out.println(revs);
      
       
	}

}

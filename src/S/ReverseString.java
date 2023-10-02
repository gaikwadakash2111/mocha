package S;

public class ReverseString {

	public static void main(String[] args) {
		
		int n=12345;
		
		String s=Integer.toString(n);
		
	//	String s="navneet";
		
		String revs="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			revs=revs+s.charAt(i);
		}
      System.out.println(revs);
	}

}

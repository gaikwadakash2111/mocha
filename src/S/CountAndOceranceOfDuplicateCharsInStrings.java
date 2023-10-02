package S;

import java.util.HashMap;

public class CountAndOceranceOfDuplicateCharsInStrings {

	public static void main(String[] args) {

		String s="navneet katariya";
		
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		
		char c[]=s.toCharArray();
	
		for(char keys:c)
		{
			if(Character.isAlphabetic(keys))
			{
			if(h.containsKey(keys))
			{
				h.put(keys, h.get(keys)+1);
			}
			else
			{
				h.put(keys, 1);
			}
			}
		}
      System.out.println(h);
	}

}

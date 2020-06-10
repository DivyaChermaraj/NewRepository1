package practise_Jun;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceChara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str= "Divya Chermaraj c";
	char[] c= str.toCharArray();
	Map<Character, Integer> count = new HashMap<Character, Integer>();
	for(char ch : c)
	{
		if(count.containsKey(ch))
			count.put(ch, count.get(ch)+1);
		else
			count.put(ch, 1);
		
	}
	System.out.println(count);
		
	}

}

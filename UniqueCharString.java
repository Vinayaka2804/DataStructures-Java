package CommonQtns;

import java.util.HashSet;

public class UniqueCharString {

	
	public static void main(String[] args) {
		
		String inp = "AAAAA";
		HashSet<Character> vin = new HashSet<Character>();
		int k=0;
		for(int i=0;i<inp.length();i++){
			
			char c = inp.charAt(i);
		
			if(vin.contains(c)){
				k++;
			}else
				vin.add(c);
			
		}
		
		System.out.println(vin.size());
		
	}
}

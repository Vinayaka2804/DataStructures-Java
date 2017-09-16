package CommonQtns;
import java.util.*;

public class Permutations {

	public static void main (String args[]) 
	{
		String word = "taco cat";
		Permutations.permutation(word);
		
	}


	public static void permutation(String inp){
		
		permutation("",inp);
	}

	public static void permutation(String prefix, String inp){
		
		int len = inp.length();
		
		if(len==0) System.out.println(prefix);
		else{
			
			for(int i=0;i<len;i++){
				
				char mychar = inp.charAt(i);
				permutation(prefix + mychar,inp.substring(0,i)+inp.substring(i+1,len));
			}
			
		}
			
		
	}
	
}


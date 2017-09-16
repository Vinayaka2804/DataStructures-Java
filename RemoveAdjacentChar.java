package CommonQtns;

import java.util.Arrays;

public class RemoveAdjacentChar {

	public static void main(String[] args) {
		
		String inp = "azxxxzy";
		char c[] = inp.toCharArray();
		int n = c.length;
		
		removeadj(c,n);
		
	}
		
	public static void removeadj(char[] c, int n ){
		
		
		char input[] = c;
		char output[] = new char[input.length];
		int k=0;
		int i;
		
		
		for(i =1;i<n;i++){
				
			if(input[i-1]!=input[i]){
				output[k]= input[i-1];
				k++;
				
			}else{
				
				while(input[i]==input[i-1]){
					i++;
				}
			}
			
		}
		
		 output[k++] = input[i-1];
		 output[k] =  '\0';
		
		 
		 if(k!=n){
			
			 removeadj(output,k);
		 }
		 else
		 {
			 System.out.println("Output"+Arrays.toString(output));
		 }
			 
		
		
		
		
	}

	
}

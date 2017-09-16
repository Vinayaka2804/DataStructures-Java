package CommonQtns;

public class StringCompression {

	
	public static void main(String[] args) {
		
		String inp = "aaahbbcd";
		int count=1;
		StringBuffer vin = new StringBuffer();
		char[] input = inp.toCharArray();
		int i;
		for(i=1;i<inp.length();i++){
			
			if(input[i]!=input[i-1]){
				vin.append(input[i-1]);
			}
			else{
				
				while(input[i]==input[i-1]){
					
					i++;
					count++;
				}
				vin.append(input[i-1]);
				vin.append(count);
				count=1;
			}
			
			
			
		}
		System.out.println("value of i: "+i);
		vin.append(input[i-1]);
		System.out.println(vin.toString());
	}
	
}
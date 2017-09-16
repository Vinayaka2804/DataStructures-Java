package CommonQtns;

import java.util.HashMap;

public class TargetSum {

	public static void main(String[] args) {
		
		int sum = 80;
		
		int arr[] = {10,20,30,40,70,15,35,60};
		
		//Approach 1: 
		/*
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]+arr[j]==sum){
					System.out.println("Pairs: "+arr[i]+""+arr[j]);
				}
			}
			
		}*/

	//Approach 2:
		
		HashMap<Integer,Integer> mylist = new HashMap<Integer,Integer>();
				
		for(int i=0;i<arr.length;i++){
			
			int compliment =sum - arr[i];
			if(mylist.containsKey(compliment)){
				int index = mylist.get(compliment);
				System.out.println("No1: "+compliment+"No2: "+arr[i]);
				
			}else{
				mylist.put(arr[i], i);
			}
		}
	
	
	}
	
	
}

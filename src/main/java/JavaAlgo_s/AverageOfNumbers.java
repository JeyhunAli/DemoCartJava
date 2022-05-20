package JavaAlgo_s;
import java.util.ArrayList;

/**
 * Java Program - Average of Numbers
 */

public class AverageOfNumbers {

	public static void main(String[] args) {
		averageList();
		averageArray();
		averageNum();
		
		
		
		
	}
	
	
	
	
	
	public static void averageList() {
		//getting numbers
				ArrayList<Integer> nums = new ArrayList<Integer>();
				nums.add(10);
				nums.add(13);
				nums.add(1);
				nums.add(16);
				nums.add(18);
				nums.add(11);
				nums.add(17);
				nums.add(3);
				
				float sum = 0;
				
				//calculate sum
				for(int num:nums) {
					sum += num;
				}
				
				//calculating  average
		        float average = (sum / nums.size()); 
			    System.out.println("Average : "+average);
			}
	
	
	public static void averageArray() {
		//numbers
				int[] nums = {1, 2, 3, 4, 5, 6, 40};
				float sum = 0;
				
				//compute sum
				for(int num:nums)
					sum += num;
				
				//compute average
				float average = (sum / nums.length); 
				
				System.out.println("Average : "+average);
	}
	
	public static void averageNum() {
		
		//numbers
				int[] nums = {1, 2, 3, 4, 5, 6};
				
				float sum = 0;
				
				//compute sum
				int i=0;
				while(i < nums.length) {
					sum += nums[i];
					i++;
				}
				
				//compute average
				float average = (sum / nums.length); 
				
				System.out.println("Average : "+average);
	}
	
	}
















